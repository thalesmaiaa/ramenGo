package com.ramengo.services;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ramengo.dtos.OrderDTO;
import com.ramengo.exceptions.NotFoundItemException;
import com.ramengo.exceptions.OrderMissingFieldException;
import com.ramengo.exceptions.ServerErrorException;
import com.ramengo.models.Broth;
import com.ramengo.models.Protein;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Value("${order-api-path}")
    String orderApiPath;

    @Value("${ramen-image-path}")
    String ramenImagePath;

    @Value("${x-api-key}")
    String apiKey;

    private final BrothService brothService;
    private final ProteinService proteinService;

    public OrderService(BrothService brothService, ProteinService proteinService) {
        this.brothService = brothService;
        this.proteinService = proteinService;
    }

    private Boolean orderHasBroth(Long brothId) {
        return brothService.existsById(brothId);
    }

    private Boolean orderHasProtein(Long brothId) {
        return proteinService.existsById(brothId);
    }

    public ObjectNode placeOrder(OrderDTO orderDTO, ObjectNode body) {
        Long brothId = orderDTO.brothId();
        Long proteinId = orderDTO.proteinId();

        if (brothId == null || proteinId == null) {
            throw new OrderMissingFieldException();
        }

        Boolean existsBroth = orderHasBroth(brothId);
        Boolean existsProtein = orderHasProtein(proteinId);

        if (existsBroth && existsProtein) {
            String orderId = generateOrderId();
            Broth broth = brothService.findById(brothId);
            Protein protein = proteinService.findById(proteinId);

            String description = broth.getDescription() + ". " +  protein.getDescription();

            body.put("id", orderId);
            body.put("description", description);
            body.put("image", ramenImagePath);

            return body;

        }

        throw new NotFoundItemException("Either brothId or proteinId weren't found");

    }

    public String generateOrderId() {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-api-key", apiKey);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<ObjectNode> response = restTemplate.exchange(orderApiPath, HttpMethod.POST, entity, ObjectNode.class);
        HttpStatus status = ((HttpStatus) response.getStatusCode());

        if (status.value() == 500) {
            throw new ServerErrorException();
        }

        ObjectNode responseBody = response.getBody();
        String orderId = responseBody.get("orderId").asText();


        return orderId;
    }

}

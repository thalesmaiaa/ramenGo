package com.ramengo.controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ramengo.dtos.OrderDTO;
import com.ramengo.services.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/orders")
public class OrdersController extends AbstractController {

    @Value("${x-api-key}")
    String apiKey;

    private final OrderService orderService;

    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<?> orderRamen(@RequestBody OrderDTO orderDTO) {

        ObjectNode body = json();
        ObjectNode orderResponse = orderService.placeOrder(orderDTO, body);
        return created(orderResponse);

    }

}

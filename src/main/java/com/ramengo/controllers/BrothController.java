package com.ramengo.controllers;

import com.ramengo.models.Broth;
import com.ramengo.services.BrothService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/broths")
public class BrothController {

    @Value("${x-api-key}")
    String apiKey;

    private final BrothService brothService;

    public BrothController(BrothService brothService) {
        this.brothService = brothService;
    }

    @GetMapping
    public ResponseEntity<List<Broth>> getAllBroths() {

        List<Broth> getAllBrothsResponse = brothService.getAllBroths();
        return ResponseEntity.ok(getAllBrothsResponse);

    }
}

package com.ramengo.controllers;

import com.ramengo.models.Protein;
import com.ramengo.services.ProteinService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proteins")
public class ProteinController {

    @Value("${x-api-key}")
    String apiKey;

    private final ProteinService proteinService;

    public ProteinController(ProteinService proteinService) {
        this.proteinService = proteinService;
    }

    @GetMapping
    public ResponseEntity<List<Protein>> getAllProteins() {

        List<Protein> getAllProteins = proteinService.getAllProteins();
        return ResponseEntity.ok(getAllProteins);

    }
}

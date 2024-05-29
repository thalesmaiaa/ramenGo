package com.ramengo.services;

import com.ramengo.models.Protein;
import com.ramengo.repositories.ProteinRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProteinService {

    private final ProteinRepository proteinRepository;

    public ProteinService(ProteinRepository proteinRepository) {
        this.proteinRepository = proteinRepository;
    }

    public List<Protein> getAllProteins() {
        return proteinRepository.findAll();
    }

    private Optional<Protein> getPossibleProtein(Long proteinId) {
        return proteinRepository.findById(proteinId);
    }

    public Boolean existsById(Long brothId) {
        Optional<Protein> protein = proteinRepository.findById(brothId);
        return protein.isPresent();
    }

    public Protein findById(Long proteinId) {
        return getPossibleProtein(proteinId).get();
    }

}

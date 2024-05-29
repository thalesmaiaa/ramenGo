package com.ramengo.services;

import com.ramengo.models.Broth;
import com.ramengo.repositories.BrothRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrothService {

    private final BrothRepository brothRepository;

    public BrothService(BrothRepository brothRepository) {
        this.brothRepository = brothRepository;
    }

    public List<Broth> getAllBroths() {
        return brothRepository.findAll();
    }

    private Optional<Broth> getPossibleBroth(Long brothId) {
        return brothRepository.findById(brothId);
    }

    public Boolean existsById(Long brothId) {
        return getPossibleBroth(brothId).isPresent();
    }

    public Broth findById(Long brothId) {
        return getPossibleBroth(brothId).get();
    }
}

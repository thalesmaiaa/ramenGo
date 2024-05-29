package com.ramengo.repositories;

import com.ramengo.models.Protein;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProteinRepository extends JpaRepository<Protein, Long> {
}

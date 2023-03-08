package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Contrat;
import com.esprit.alternance.kaddem.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
}

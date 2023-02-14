package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Equipe;
import com.esprit.alternance.kaddem.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
}

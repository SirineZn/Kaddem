package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.DetailEquipe;
import com.esprit.alternance.kaddem.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe, Integer> {
}

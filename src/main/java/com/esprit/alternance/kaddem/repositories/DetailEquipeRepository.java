package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.DetailEquipe;
import com.esprit.alternance.kaddem.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailEquipeRepository extends JpaRepository<DetailEquipe, Long> {
}

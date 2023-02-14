package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
}

package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Equipe;
import com.esprit.alternance.kaddem.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Integer> {

}

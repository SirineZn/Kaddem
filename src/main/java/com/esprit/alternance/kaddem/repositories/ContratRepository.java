package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Contrat;
import com.esprit.alternance.kaddem.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
    List<Contrat> findByDateFinContratBeforeAndArchiveIsFalse(Date date);

    List<Contrat> findByDateDebutContratAfterAndDateFinContratBeforeAndArchiveFalse(Date startDate, Date endDate);
}

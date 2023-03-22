package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Contrat;
import com.esprit.alternance.kaddem.entities.Equipe;

import java.util.Date;
import java.util.List;

public interface IContratService {

    List<Contrat> retrieveAllContrats();

    Contrat addContrat(Contrat c);

    Contrat updateContrat (Contrat e);

    Contrat retrieveContrat (Long idContrat);

    void deleteContrat(Long idContrat);

    void retrieveAndUpdateStatusContrat();

}

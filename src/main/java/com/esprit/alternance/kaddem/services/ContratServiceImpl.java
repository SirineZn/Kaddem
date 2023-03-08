package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Contrat;
import com.esprit.alternance.kaddem.entities.Universite;
import com.esprit.alternance.kaddem.repositories.ContratRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ContratServiceImpl implements IContratService {
    ContratRepository contratRepository;
    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>) contratRepository.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return contratRepository.findById(idContrat).get();
    }

    @Override
    public void deleteContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);

    }
}

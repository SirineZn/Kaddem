package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Departement;
import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.entities.Universite;
import com.esprit.alternance.kaddem.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class UniversiteServiceImpl implements IUniversiteService{

    UniversiteRepository universiteRepository;


    @Override
    public List<Universite> retrieveAllUniversite() {
        return (List<Universite>) universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u, Departement d) {
        Set<Departement> departments = u.getDepartements();
        departments.add(d);
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite universite, Integer idUniversite) {
        Universite universite1 = universiteRepository.findById(idUniversite).get();
        universite1.setNomUniv(universite.getNomUniv());

        return universiteRepository.save(universite1);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void deleteUniversite(Integer idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}

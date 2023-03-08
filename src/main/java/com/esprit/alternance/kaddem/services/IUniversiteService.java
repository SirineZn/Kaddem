package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Departement;
import com.esprit.alternance.kaddem.entities.Universite;

import java.util.List;

public interface IUniversiteService {

     List<Universite> retrieveAllUniversite();

     Universite addUniversite(Universite u, Departement d);



     Universite updateUniversite(Universite universite, Integer idUniversite);

     Universite retrieveUniversite (Integer idUniversite);


     void deleteUniversite(Integer idUniversite);

}

package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant (Etudiant e, Integer idEtudiant);

    Etudiant retrieveEtudiant (Integer idEtudiant);

    void deleteEtudiant(Integer idEtudiant);

    void assignEtudiantToDepartement (Integer etudiantId , Long departementId );
}

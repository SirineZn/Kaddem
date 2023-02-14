package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant (Integer idEtudiant);
}

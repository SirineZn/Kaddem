package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Departement;

import java.util.List;

public interface IDepartementService {

    List<Departement> retrieveAllDepartment();

    Departement addDepartment(Departement e);

    Departement updateDepartment(Departement department, Long idDepartment);

    Departement retrieveDepartment (Long idDepartment);


    void deleteDepartment(Long idDepartment);

}

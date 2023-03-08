package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Departement;
import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.repositories.DepartmentRepository;
import com.esprit.alternance.kaddem.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class DepartementServiceImpl implements IDepartementService{

     DepartmentRepository departmentRepository;
     EtudiantRepository etudiantRepository;
    @Override
    public List<Departement> retrieveAllDepartment() {
        return (List<Departement>) departmentRepository.findAll();
    }

    @Override
    public Departement addDepartment(Departement e) {
        return departmentRepository.save(e);
    }

    @Override
    public Departement updateDepartment(Departement department, Long idDepartment) {
        Departement department1 = departmentRepository.findById(idDepartment).get();
        department1.setNomDepart(department.getNomDepart());

        return departmentRepository.save(department1);
    }

    @Override
    public Departement retrieveDepartment(Long idDepartment) {
        return departmentRepository.findById(idDepartment).get();
    }

    @Override
    public void deleteDepartment(Long idDepartment) {
        departmentRepository.deleteById(idDepartment);
    }

}

package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Departement;
import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.repositories.DepartmentRepository;
import com.esprit.alternance.kaddem.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    DepartmentRepository departmentRepository;


    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e ,Integer idEtudiant) {
        Etudiant etudiant1 = etudiantRepository.findById(idEtudiant).get();
        etudiant1.setPrenomE(e.getPrenomE());
        etudiant1.setNomE(e.getNomE());
        etudiant1.setOp(e.getOp());

        return etudiantRepository.save(etudiant1);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void deleteEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Long departementId) {
        Departement department = departmentRepository.findById(departementId).get();
        Etudiant e =etudiantRepository.findById(etudiantId).get();
        e.setDepartement(department);
        etudiantRepository.save(e);
    }
}

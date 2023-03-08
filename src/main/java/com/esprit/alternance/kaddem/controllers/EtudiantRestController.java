package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {

    IEtudiantService etudiantService;
    // http://localhost:8089/kaddem/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }
    // http://localhost:8089/kaddem/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiantId}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiantId") Integer etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }
    // http://localhost:8089/kaddem/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }
    // http://localhost:8089/kaddem/etudiant/update-etudiant
    @PutMapping("/update-etudiant/{etudiantId}")
    public Etudiant updateEtudiant(@RequestBody Etudiant e, @PathVariable Integer etudiantId) {
        return etudiantService.updateEtudiant(e,etudiantId);

    }

    // http://localhost:8089/kaddem/etudiant/delete-etudiant
    @DeleteMapping("/delete-etudiant/{etudiant-id}")
    public void deleteEtudiant(@PathVariable("etudiant-id") Integer etudiantId) {
        etudiantService.deleteEtudiant(etudiantId);
    }

    @PutMapping("/add-etudiant-to-department/{etudiant-id}/{department-id}")
    public void assignEtudiantToDepartment(@PathVariable("etudiant-id") Integer etudiantId, @PathVariable("department-id") Long departmentId){
        etudiantService.assignEtudiantToDepartement(etudiantId,departmentId);
    }
}

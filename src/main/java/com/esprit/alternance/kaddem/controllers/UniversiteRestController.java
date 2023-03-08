package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.Departement;
import com.esprit.alternance.kaddem.entities.Universite;
import com.esprit.alternance.kaddem.services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Gestion des universités")
@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {

    IUniversiteService universiteService;

    // http://localhost:8089/kaddem/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    @Operation(description = "récupérer la liste des universités")
    public List<Universite> getUniversite() {
        List<Universite> listUniversite = universiteService.retrieveAllUniversite();
        return listUniversite;
    }
    // http://localhost:8089/kaddem/universite/retrieve-universite/8
    @GetMapping("/retrieve-universite/{universiteId}")
    public Universite retrieveUniversite(@PathVariable("universiteId") Integer universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }
    // http://localhost:8089/kaddem/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite e,@RequestBody Departement d) {

        Universite universite = universiteService.addUniversite(e,d);
        return universite;
    }
    // http://localhost:8089/kaddem/universite/update-universite
    @PutMapping("/update-universite/{universiteId}")
    public Universite updateUniversite(@RequestBody Universite e, @PathVariable Integer universiteId) {
        return universiteService.updateUniversite(e,universiteId);

    }

    // http://localhost:8089/kaddem/universite/delete-universite
    @DeleteMapping("/delete-universite/{universite-id}")
    public void deleteUniversite(@PathVariable("universite-id") Integer universiteId) {
        universiteService.deleteUniversite(universiteId);
    }


}

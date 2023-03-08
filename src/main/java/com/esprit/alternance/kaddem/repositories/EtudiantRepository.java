package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Equipe;
import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.entities.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    //Récupérer les étudiants d’un département donné
    //List<Etudiant> findByDepartmentNomDepart(String nomDepart);

    //List<Etudiant> findByDepartmentIdDepart(String idDepart);
    //Récupérer les étudiants dont l’équipe a un niveau SENIOR
    //List<Etudiant> findByEquipeNiveau(Niveau nv);
}

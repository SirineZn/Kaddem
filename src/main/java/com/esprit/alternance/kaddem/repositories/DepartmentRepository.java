package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Departement;
import com.esprit.alternance.kaddem.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Departement, Long> {
}

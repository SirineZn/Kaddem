package com.esprit.alternance.kaddem.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart", nullable = false)
    private Long idDepart;
    private String nomDepart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="departement")
    private Set<Etudiant> etudiant;

}

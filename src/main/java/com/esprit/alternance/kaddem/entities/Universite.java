package com.esprit.alternance.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv", nullable = false)
    private Integer idUniv;
    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements;
}

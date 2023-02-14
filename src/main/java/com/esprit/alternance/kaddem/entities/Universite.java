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
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv", nullable = false)
    private Integer idUniv;
    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements;
}

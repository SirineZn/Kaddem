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
public class Equipe implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe", nullable = false)
    private Integer idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @ManyToMany(mappedBy="equipe", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;

    @OneToOne
    private DetailEquipe equipeDetail;
}

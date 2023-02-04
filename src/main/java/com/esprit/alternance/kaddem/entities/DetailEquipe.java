package com.esprit.alternance.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe", nullable = false)
    private Long idDetailEquipe;
    private Integer salle;
    private String thematique;

    @OneToOne(mappedBy="equipeDetail")
    private Equipe equipe;


}

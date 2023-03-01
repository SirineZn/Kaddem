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
@Table( name = "Etudiant") //Facultatif
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Integer idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option op;
// Constructeur et accesseurs (getters) et mutateurs (setters)
  @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
  private Set<Contrat> contarts;

  @ManyToMany(cascade = CascadeType.ALL)
  private Set<Equipe> equipe;

    @ManyToOne(cascade = CascadeType.ALL)
    private  Departement departement;

}

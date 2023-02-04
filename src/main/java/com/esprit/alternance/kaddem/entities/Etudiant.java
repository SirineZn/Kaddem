package com.esprit.alternance.kaddem.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Etudiant")
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

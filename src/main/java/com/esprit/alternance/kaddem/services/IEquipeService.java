package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);

    void deleteEquipe(Integer id);
}

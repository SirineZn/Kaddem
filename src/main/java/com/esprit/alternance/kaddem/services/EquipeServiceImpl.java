package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Equipe;
import com.esprit.alternance.kaddem.repositories.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class EquipeServiceImpl implements IEquipeService{
    EquipeRepository equipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById(idEquipe).get();
    }

    @Override
    public void deleteEquipe(Integer id) {
        equipeRepository.deleteById(id);

    }
}

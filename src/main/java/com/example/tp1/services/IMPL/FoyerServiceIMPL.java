package com.example.tp1.services.IMPL;

import com.example.tp1.entity.Foyer;
import com.example.tp1.entity.TypeChambre;
import com.example.tp1.repository.FoyerRepository;
import com.example.tp1.services.interfaces.IfoyerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceIMPL implements IfoyerService {
    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
foyerRepository.deleteById(idFoyer);
    }

    @Override
    public Foyer getFoyerTypeChambreEtNomBloc(TypeChambre typec, String nom) {
        return null;
    }
}

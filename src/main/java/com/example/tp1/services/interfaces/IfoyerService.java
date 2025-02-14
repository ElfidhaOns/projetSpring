package com.example.tp1.services.interfaces;

import com.example.tp1.entity.Foyer;

import java.util.List;

public interface IfoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer (Foyer f);
    Foyer updateFoyer (Foyer f);
    Foyer retrieveFoyer (long idFoyer);
    void removeFoyer (long idFoyer);

}

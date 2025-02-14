package com.example.tp1.services.interfaces;

import com.example.tp1.entity.Chambre;

import java.util.List;

public interface IchambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Chambre retrieveChambre (long idChambre);

}

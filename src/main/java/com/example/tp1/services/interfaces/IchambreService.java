package com.example.tp1.services.interfaces;

import com.example.tp1.entity.Bloc;
import com.example.tp1.entity.Chambre;
import com.example.tp1.entity.TypeChambre;

import java.util.List;

public interface IchambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Chambre retrieveChambre (long idChambre);
    List<Chambre> getChambreByAddresseUniversite(String ads);
    Chambre getChambreByCINEtudaintEtNomBloc(Long CIN,String nom);

    Bloc affecterChambresABloc(List<Long> numChambre, long idBloc);
    List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) ;

}

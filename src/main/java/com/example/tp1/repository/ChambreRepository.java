package com.example.tp1.repository;

import com.example.tp1.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findByBlocFoyerUniversiteAdresse(String ads);
    Chambre findByReservationsEtudiantsCinAndBlocNomBloc(Long cin, String nomBloc);


}

package com.example.tp1.repository;

import com.example.tp1.entity.Reservation;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
//    public List<Reservation> findByAnneeUniversitaireAnd(Date anneeUniversitaire, String nomUniversite);

}

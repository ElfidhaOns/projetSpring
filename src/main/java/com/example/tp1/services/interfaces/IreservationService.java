package com.example.tp1.services.interfaces;

import com.example.tp1.entity.Reservation;

import java.util.List;

public interface IreservationService {

    List<Reservation> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (String idReservation);

}

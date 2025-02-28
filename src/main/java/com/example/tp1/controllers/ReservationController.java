package com.example.tp1.controllers;

import com.example.tp1.entity.Reservation;
import com.example.tp1.services.interfaces.IreservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")
public class ReservationController {

     IreservationService ireservationService;

    @GetMapping("/getAllReservations")
    public List<Reservation> retrieveAllReservation() {
        return ireservationService.retrieveAllReservation();
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation res) {
        return ireservationService.updateReservation(res);
    }

    @GetMapping("/retrieveReservation/{idReservation}")
    public Reservation retrieveReservation(@PathVariable String idReservation) {
        return ireservationService.retrieveReservation(idReservation);
    }
}

package com.example.tp1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int idReservation;
     Date anneeUniversitaire;
     boolean estValide;
     @ManyToMany
     private List<Etudiant> etudiants;

}

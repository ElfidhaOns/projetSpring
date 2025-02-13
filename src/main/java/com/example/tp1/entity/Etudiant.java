package com.example.tp1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idEtudiant;
     String nomEt;
     String prenomEt;
     Long cin;
     String ecole;
     Date dateNaissance;
}

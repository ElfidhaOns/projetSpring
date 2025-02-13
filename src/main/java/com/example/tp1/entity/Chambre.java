package com.example.tp1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idChambre;

     Long numeroChambre;

    @Enumerated(EnumType.STRING)
     TypeChambre typeC;
}

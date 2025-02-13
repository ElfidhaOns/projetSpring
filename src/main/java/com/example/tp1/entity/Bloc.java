package com.example.tp1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idBloc;

     String nomBloc;
     Long capaciteBloc;
}

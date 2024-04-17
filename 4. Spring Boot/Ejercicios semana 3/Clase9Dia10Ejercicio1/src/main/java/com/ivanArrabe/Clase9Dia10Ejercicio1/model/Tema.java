package com.ivanArrabe.Clase9Dia10Ejercicio1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idTema;
    private String nombre;
    private String descripcion;
}

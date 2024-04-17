package com.ivanArrabe.Clase9Dia10Ejercicio1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idCurso;
    private String nombre;
    private String tipoCurso;
    private LocalDate fechaFinalizacion;

    @OneToMany
    private List<Tema> temas;
}

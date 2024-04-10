package com.ivanArrabe.Clase5Dia6Ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calificacion {
    private Long id;
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedio;
    private Estudiante estudiante;
}

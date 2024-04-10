package com.ivanArrabe.Clase5Dia6Ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    private Long numMatricula;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
}

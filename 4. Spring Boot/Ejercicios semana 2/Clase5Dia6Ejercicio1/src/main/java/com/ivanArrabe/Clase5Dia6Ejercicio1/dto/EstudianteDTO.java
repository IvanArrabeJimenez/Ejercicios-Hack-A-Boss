package com.ivanArrabe.Clase5Dia6Ejercicio1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteDTO {
    private Long numMatriculaEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedioCalificacion;
}

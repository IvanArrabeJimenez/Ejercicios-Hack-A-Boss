package com.ivanArrabe.Clase5Dia6Ejercicio1.service;

import com.ivanArrabe.Clase5Dia6Ejercicio1.dto.EstudianteDTO;
import com.ivanArrabe.Clase5Dia6Ejercicio1.model.Calificacion;

import java.util.List;

public interface IUniversidadService {
    public void crearEstudiante(Calificacion calificacion);

    public List<EstudianteDTO> obtenerEstudiantes();

    public EstudianteDTO calificacionesEstudiante(Long numMatriculaEstudiante);

    public List<EstudianteDTO> obtenerEstudiantesOrdenados();
}

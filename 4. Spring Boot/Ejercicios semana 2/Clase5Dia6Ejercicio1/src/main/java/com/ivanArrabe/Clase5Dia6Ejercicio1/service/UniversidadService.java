package com.ivanArrabe.Clase5Dia6Ejercicio1.service;

import com.ivanArrabe.Clase5Dia6Ejercicio1.dto.EstudianteDTO;
import com.ivanArrabe.Clase5Dia6Ejercicio1.model.Calificacion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
public class UniversidadService implements IUniversidadService {

    List<EstudianteDTO> estudiantesDTO = new ArrayList<>();

    @Override
    public void crearEstudiante(Calificacion calificacion) {
        //Recogemos los datos del Estudiante y la Calificación del JSON y lo pasamos al EstudianteDTO
        EstudianteDTO estudianteDTO = new EstudianteDTO();
        estudianteDTO.setNumMatriculaEstudiante(calificacion.getEstudiante().getNumMatricula());
        estudianteDTO.setNombreEstudiante(calificacion.getEstudiante().getNombre());
        estudianteDTO.setApellidoEstudiante(calificacion.getEstudiante().getApellido());
        estudianteDTO.setCalificacion1(calificacion.getCalificacion1());
        estudianteDTO.setCalificacion2(calificacion.getCalificacion2());
        estudianteDTO.setCalificacion3(calificacion.getCalificacion3());
        estudianteDTO.setPromedioCalificacion(promediarCalificacionAlumno(calificacion));
        //Añadimos el estudiante DTO con todos sus datos a la lista que luego vamos a visualizar
        estudiantesDTO.add(estudianteDTO);
    }

    private Double promediarCalificacionAlumno(Calificacion calificacion) {
        List<Double> calificaciones = Arrays.asList(calificacion.getCalificacion1(), calificacion.getCalificacion2(), calificacion.getCalificacion3());
        double promedioCalificaciones = calificaciones.stream()
                .filter(c -> c != null)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
        return promedioCalificaciones;
    }

    @Override
    public List<EstudianteDTO> obtenerEstudiantes() {
        return estudiantesDTO;
    }

    @Override
    public EstudianteDTO calificacionesEstudiante(Long numMatriculaEstudiante) {
        return estudiantesDTO.stream()
                .filter(e -> e.getNumMatriculaEstudiante().equals(numMatriculaEstudiante))
                .findFirst()
                .get();
    }

    @Override
    public List<EstudianteDTO> obtenerEstudiantesOrdenados() {
        return estudiantesDTO.stream()
                .sorted(Comparator.comparingDouble(EstudianteDTO::getPromedioCalificacion).reversed())
                .toList();
    }


}

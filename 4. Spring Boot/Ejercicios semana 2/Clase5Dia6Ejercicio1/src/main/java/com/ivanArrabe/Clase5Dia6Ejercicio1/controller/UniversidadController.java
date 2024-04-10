package com.ivanArrabe.Clase5Dia6Ejercicio1.controller;

import com.ivanArrabe.Clase5Dia6Ejercicio1.dto.EstudianteDTO;
import com.ivanArrabe.Clase5Dia6Ejercicio1.model.Calificacion;
import com.ivanArrabe.Clase5Dia6Ejercicio1.service.UniversidadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universidad")
public class UniversidadController {

    UniversidadService universidadService = new UniversidadService();

    //He creado un método Post para introducir los datos y he metido el JSON en el proyecto para realizar las pruebas.
    //También he metido la postman-collection para hacer las pruebas desde postman.
    @PostMapping("/estudiante/crear")
    public String crearEstudiante(@RequestBody Calificacion calificacion) {
        universidadService.crearEstudiante(calificacion);
        return "Estudiante creado: " + calificacion.getEstudiante().getNombre() + " " + calificacion.getEstudiante().getApellido();
    }

    @GetMapping("/estudiantes")
    public List<EstudianteDTO> obtenerEstudiantes() {
        return universidadService.obtenerEstudiantes();
    }

    @GetMapping("/calificaciones/{numMatriculaEstudiante}")
    public EstudianteDTO calificacionesEstudiante(@PathVariable Long numMatriculaEstudiante) {
        return universidadService.calificacionesEstudiante(numMatriculaEstudiante);
    }

    @GetMapping("/estudiantes/ordendesc")
    public List<EstudianteDTO> obtenerEstudiantesOrdenados() {
        return universidadService.obtenerEstudiantesOrdenados();
    }
}

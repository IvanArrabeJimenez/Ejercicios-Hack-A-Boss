package com.ivanArrabe.Clase9Dia10Ejercicio1.controller;

import com.ivanArrabe.Clase9Dia10Ejercicio1.dto.CursoDto;
import com.ivanArrabe.Clase9Dia10Ejercicio1.dto.TemaDto;
import com.ivanArrabe.Clase9Dia10Ejercicio1.model.Curso;
import com.ivanArrabe.Clase9Dia10Ejercicio1.service.ICursoService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    /*Para facilitar las cosas he creado una carpeta llamada "Base datos postman y pruebas" en el directorio
    * "resources" en el que está la collection de postman para las pruebas, un json con las pruebas que he
    * realizado y también el archivo sql con la base de datos."
    *
    * También he implementado Spring Security para ampliar la funcionalidad de la App y también practicar lo que
    * hemos aprendido en clase sobre el tema.*/

    @Autowired
    private ICursoService cursoService;

    @PostMapping("/crear")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La operación se ejecutó correctamente."),
            @ApiResponse(responseCode = "400", description = "Algún parámetro no cumple con el formato o es requerido y no está presente."),
            @ApiResponse(responseCode = "500", description = "Error interno de servidor.")
    })
    public String saveCurso(@RequestBody Curso curso){
        cursoService.saveCurso(curso);
        return "Curso creado correctamente: "+curso.getIdCurso()+" "+curso.getNombre();
    }

    @GetMapping("/lista")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La operación se ejecutó correctamente."),
            @ApiResponse(responseCode = "400", description = "Algún parámetro no cumple con el formato o es requerido y no está presente."),
            @ApiResponse(responseCode = "500", description = "Error interno de servidor.")
    })
    public List<Curso> getCursos(){
        return cursoService.getCursos();
    }

    @GetMapping("/lista/temas/{id}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La operación se ejecutó correctamente"),
            @ApiResponse(responseCode = "204", description = "No se encontró el curso que usted está buscando"),
            @ApiResponse(responseCode = "400", description = "Algún parámetro no cumple con el formato o es requerido y no está presente."),
            @ApiResponse(responseCode = "500", description = "Error interno de servidor.")
    })
    public ResponseEntity<List<TemaDto>> getCursoTemas(@PathVariable Long id){
        Curso curso = cursoService.findCurso(id);
        if (curso == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(cursoService.getCursoTemas(id));
    }

    //En este endpoint en vez de acotarlo a la palabra java he puesto que se pueda introducir una palabra
    //y muestre los cursos de la palabra introducida, de este modo nos sirve para buscar todos los cursos por
    //una palabra solicitada y no una fija.
    @GetMapping("/buscar/{nombre}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La operación se ejecutó correctamente."),
            @ApiResponse(responseCode = "204", description = "No se encontró el nombre del curso introducido."),
            @ApiResponse(responseCode = "400", description = "Algún parámetro no cumple con el formato o es requerido y no está presente."),
            @ApiResponse(responseCode = "500", description = "Error interno de servidor.")
    })
    public List<CursoDto> getCursosJava(@PathVariable String nombre){
        return cursoService.getCursosJava(nombre);
    }

    @PutMapping("/editar/{id}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La operación se ejecutó correctamente"),
            @ApiResponse(responseCode = "204", description = "No se encontró el curso que intenta editar"),
            @ApiResponse(responseCode = "400", description = "Algún parámetro no cumple con el formato o es requerido y no está presente."),
            @ApiResponse(responseCode = "500", description = "Error interno de servidor.")
    })
    public ResponseEntity<Curso> editCurso(@PathVariable Long id, @RequestBody Curso cursoEdit){
        Curso curso = cursoService.findCurso(id);
        if (curso == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        curso.setNombre(cursoEdit.getNombre());
        curso.setTipoCurso(cursoEdit.getTipoCurso());
        curso.setFechaFinalizacion(cursoEdit.getFechaFinalizacion());
        curso.setTemas(cursoEdit.getTemas());

        cursoService.saveCurso(curso);
        return ResponseEntity.ok(curso);
    }

}

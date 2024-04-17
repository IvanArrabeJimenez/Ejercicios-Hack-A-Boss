package com.ivanArrabe.Clase9Dia10Ejercicio1.controller;

import com.ivanArrabe.Clase9Dia10Ejercicio1.model.Tema;
import com.ivanArrabe.Clase9Dia10Ejercicio1.service.ITemaService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/temas")
public class TemaController {

    @Autowired
    private ITemaService temaService;

    @PostMapping("/crear")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La operación se ejecutó correctamente."),
            @ApiResponse(responseCode = "400", description = "Algún parámetro no cumple con el formato o es requerido y no está presente."),
            @ApiResponse(responseCode = "500", description = "Error interno de servidor.")
    })
    public String saveTema(@RequestBody Tema tema){
        temaService.saveTema(tema);
        return "Tema creado correctamente: "+tema.getIdTema()+" "+tema.getNombre();
    }

    @PutMapping("/editar/{id}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La operación se ejecutó correctamente"),
            @ApiResponse(responseCode = "204", description = "No se encontró el tema que intenta editar"),
            @ApiResponse(responseCode = "400", description = "Algún parámetro no cumple con el formato o es requerido y no está presente."),
            @ApiResponse(responseCode = "500", description = "Error interno de servidor.")
    })
    public ResponseEntity<Tema> editTema(@PathVariable Long id, @RequestBody Tema temaEdit){
        Tema tema = temaService.findTema(id);
        if (tema == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        tema.setNombre(temaEdit.getNombre());
        tema.setDescripcion(temaEdit.getDescripcion());

        temaService.saveTema(tema);
        return ResponseEntity.ok(tema);
    }
}

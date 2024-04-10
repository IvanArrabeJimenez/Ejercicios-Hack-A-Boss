package com.ivanArrabe.Clase6Dia7Ejercicio1.controller;

import com.ivanArrabe.Clase6Dia7Ejercicio1.dto.PlatoDTO;
import com.ivanArrabe.Clase6Dia7Ejercicio1.service.IPlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calorias")
public class PlatoController {

    //Utilizaré la anotación @Autowired ya que estoy haciendo el ejercicio después de haberlo visto en clase
    @Autowired
    private IPlatoService platoService;

    @GetMapping("/{id}")
    public ResponseEntity<PlatoDTO> consultarPlatoPorId(@PathVariable Long id) {
        PlatoDTO platoDTO = platoService.consultarPlatoPorId(id);
        if (platoDTO != null) {
            return ResponseEntity.ok(platoDTO);
        } else return ResponseEntity.notFound().build();
    }
}

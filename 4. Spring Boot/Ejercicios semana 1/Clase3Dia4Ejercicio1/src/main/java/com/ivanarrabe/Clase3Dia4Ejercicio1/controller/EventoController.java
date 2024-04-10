package com.ivanarrabe.Clase3Dia4Ejercicio1.controller;

import com.ivanarrabe.Clase3Dia4Ejercicio1.model.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventoController {

    List<Evento> eventos = new ArrayList<>();

    @PostMapping("/evento")
    public String crearEvento(@RequestBody Evento evento) {
        eventos.add(evento);
        return "Evento agregado a la agenda!!";
    }

    @GetMapping("/eventos")
    public List<Evento> listaEventos() {
        return eventos;
    }

    @GetMapping("/evento/{id}")
    public Evento eventoId(@PathVariable Long id) {
        return eventos.stream()
                .filter(evento -> evento.getId().equals(id))
                .findFirst()
                .get();
    }
}

package com.ivanArrabe.Clase1Dia2Ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RefranController {
    @GetMapping
    public String devolverRefran(){
        List<String> refranes = new ArrayList<>(List.of("El hábito no hace al monje","Una golondrina no hace verano",
                "Poco a poco, se anda lejos","Un clavo saca otro calvo","El que a hierro mata, a hierro muere",
                "Matar moscas a cañonazos","Agua que no has de beber, déjala correr","A enemigo que huye, puente de plata",
                "En boca cerrada, no entran moscas","A lo hecho, pecho"));
        return refranes.get((int)(Math.random()*refranes.size()));
    }
}

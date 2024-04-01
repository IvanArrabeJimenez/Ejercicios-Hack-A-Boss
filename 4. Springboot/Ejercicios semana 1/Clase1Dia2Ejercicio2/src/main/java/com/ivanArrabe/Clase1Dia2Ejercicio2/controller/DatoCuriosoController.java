package com.ivanArrabe.Clase1Dia2Ejercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DatoCuriosoController {
    @GetMapping
    public String devolverDatoCurioso(){
        List<String> datosCuriosos = new ArrayList<>(List.of("Los aguacates son una fruta, no una verdura",
                "La Torre Eiffel puede ser 15 cm más alta durante el verano","La tripofobia es el miedo a los agujeros muy juntos",
                "Australia es más ancha que la Luna","Los dientes humanos son la única parte del cuerpo que no puede curarse por sí misma",
                "En Suiza es ilegal tener una sola cobaya","Los antiguos romanos solían echar un trozo de pan tostado en el vino",
                "El corazón de las gambas se encuentra en la cabeza","La gente es más creativa en la ducha",
                "El primer avión voló el 17 de diciembre de 1903","Venus es el único planeta que gira en el sentido de las agujas del reloj"));
        return datosCuriosos.get((int)(Math.random()*datosCuriosos.size()));
    }
}

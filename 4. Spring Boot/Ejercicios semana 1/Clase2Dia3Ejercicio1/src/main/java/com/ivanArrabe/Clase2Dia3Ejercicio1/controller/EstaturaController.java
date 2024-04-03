package com.ivanArrabe.Clase2Dia3Ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstaturaController {
    @GetMapping("/estatura/{centimetros}")
    public String convertirEnMetros(@PathVariable Double centimetros) {
        return "El equivalente a " + centimetros.intValue() + " cm es de " + centimetros / 100 + " metros.";
    }
}

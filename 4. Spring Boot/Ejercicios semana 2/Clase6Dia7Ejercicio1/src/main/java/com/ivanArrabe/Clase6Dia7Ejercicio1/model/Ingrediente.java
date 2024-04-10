package com.ivanArrabe.Clase6Dia7Ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {
    private Long id;
    private String nombre;
    private Integer calorias;
}

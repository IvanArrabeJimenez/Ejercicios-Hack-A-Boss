package com.ivanArrabe.Clase7Dia8Ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    private Long id;
    private String brand;
    private String model;
    private Long kilometers;
    private Integer doors;
    private Double price;
}

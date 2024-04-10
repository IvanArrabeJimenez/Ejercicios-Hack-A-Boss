package com.ivanArrabe.Clase6Dia7Ejercicio1.dto;

import com.ivanArrabe.Clase6Dia7Ejercicio1.model.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlatoDTO {
    private Long idPlato;
    private String nombre;
    private Integer totalCalorias;
    private List<Ingrediente> ingredientes;
    private Ingrediente mayorCantidadCalorias;
}

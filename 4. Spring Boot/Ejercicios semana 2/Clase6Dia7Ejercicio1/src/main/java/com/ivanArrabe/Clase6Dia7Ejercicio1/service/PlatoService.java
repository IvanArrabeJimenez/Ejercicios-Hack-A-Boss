package com.ivanArrabe.Clase6Dia7Ejercicio1.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivanArrabe.Clase6Dia7Ejercicio1.dto.PlatoDTO;
import com.ivanArrabe.Clase6Dia7Ejercicio1.model.Ingrediente;
import com.ivanArrabe.Clase6Dia7Ejercicio1.model.Plato;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

@Service
public class PlatoService implements IPlatoService {
    private List<Plato> loadDataBase() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("classpath:food.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Plato>> typeRef = new TypeReference<>() {
        };
        List<Plato> plato = null;
        try {
            plato = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return plato;
    }

    @Override
    public PlatoDTO consultarPlatoPorId(Long id) {
        Plato plato = loadDataBase().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);

        PlatoDTO platoDTO = new PlatoDTO();
        platoDTO.setIdPlato(plato.getId());
        platoDTO.setNombre(plato.getNombre());
        platoDTO.setTotalCalorias(sumarCalorias(plato));
        platoDTO.setIngredientes(plato.getIngredientes());
        platoDTO.setMayorCantidadCalorias(calcularMayorCalorias(plato));
        return platoDTO;
    }

    private Ingrediente calcularMayorCalorias(Plato plato) {
        return plato.getIngredientes().stream()
                .max(Comparator.comparingInt(Ingrediente::getCalorias))
                .orElse(null);
    }

    private Integer sumarCalorias(Plato plato) {
        return plato.getIngredientes().stream()
                .mapToInt(ingrediente -> ingrediente.getCalorias())
                .sum();
    }
}

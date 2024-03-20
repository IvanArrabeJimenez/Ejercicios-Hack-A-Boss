package com.ivanarrabe.clase10dia11ejercicio1.persistencia;

import com.ivanarrabe.clase10dia11ejercicio1.logica.Partido;
import java.util.List;

public class ControladoraPersistencia {
    
PartidoJpaController parJpa = new PartidoJpaController();

    public void crearPartidos() {
        parJpa.crearPartidos();
    }

    public void votar(String voto) {
        parJpa.votar(voto);
    }

    public List<Partido> traerResultados() {
        return parJpa.findPartidoEntities();
    }
    
}

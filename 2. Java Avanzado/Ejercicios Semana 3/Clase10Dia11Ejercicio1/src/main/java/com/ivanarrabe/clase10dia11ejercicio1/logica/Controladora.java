package com.ivanarrabe.clase10dia11ejercicio1.logica;

import com.ivanarrabe.clase10dia11ejercicio1.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearPartidos() {
        controlPersis.crearPartidos();
    }

    public void votar(String voto) {
        controlPersis.votar(voto);
    }

    public List<Partido> traerResultados() {
        return controlPersis.traerResultados();
    }
    
}

package com.ivanarrabe.ejerciciointegradorjspjpa.logica;

import com.ivanarrabe.ejerciciointegradorjspjpa.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersist = new ControladoraPersistencia();

    public void crearEquipo(Equipo equipo) {
        controlPersist.crearEquipo(equipo);
    }

    public List<Equipo> traerEquipos() {
        return controlPersist.traerEquipos();
    }

    public void crearPartido(Partido partido, Long idEquipo1, Long idEquipo2) {
        //Obtenemos los equipos a partir de los id
        Equipo equipo1 = controlPersist.buscarEquipo(idEquipo1);
        Equipo equipo2 = controlPersist.buscarEquipo(idEquipo2);
        //Introducir los equipos al partido
        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);

        controlPersist.crearPartido(partido);
    }

    public List<Partido> traerPartidos() {
        return controlPersist.traerPartidos();
    }

}

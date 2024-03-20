package com.ivanarrabe.ejerciciointegradorjspjpa.persistencia;

import com.ivanarrabe.ejerciciointegradorjspjpa.logica.Equipo;
import com.ivanarrabe.ejerciciointegradorjspjpa.logica.Partido;
import java.util.List;

public class ControladoraPersistencia {

    EquipoJpaController equipoJpa = new EquipoJpaController();
    PartidoJpaController partJpa = new PartidoJpaController();

    public void crearEquipo(Equipo equipo) {
        equipoJpa.create(equipo);
    }

    public List<Equipo> traerEquipos() {
        return equipoJpa.findEquipoEntities();
    }

    public Equipo buscarEquipo(Long id) {
        return equipoJpa.findEquipo(id);
    }

    public void crearPartido(Partido partido) {
        partJpa.create(partido);
    }

    public List<Partido> traerPartidos() {
        return partJpa.findPartidoEntities();
    }
}

package com.ivanarrabe.ejerciciointegradorjspjpa.logica;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Partido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    private int resultadoEquipo1;
    private int resultadoEquipo2;

    @ManyToOne
    private Equipo equipo1;

    @ManyToOne
    private Equipo equipo2;

    public Partido() {
    }

    public Partido(LocalDate fecha, int resultadoEquipo1, int resultadoEquipo2, Equipo equipo1, Equipo equipo2) {
        this.fecha = fecha;
        this.resultadoEquipo1 = resultadoEquipo1;
        this.resultadoEquipo2 = resultadoEquipo2;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getResultadoEquipo1() {
        return resultadoEquipo1;
    }

    public void setResultadoEquipo1(int resultadoEquipo1) {
        this.resultadoEquipo1 = resultadoEquipo1;
    }

    public int getResultadoEquipo2() {
        return resultadoEquipo2;
    }

    public void setResultadoEquipo2(int resultadoEquipo2) {
        this.resultadoEquipo2 = resultadoEquipo2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

}

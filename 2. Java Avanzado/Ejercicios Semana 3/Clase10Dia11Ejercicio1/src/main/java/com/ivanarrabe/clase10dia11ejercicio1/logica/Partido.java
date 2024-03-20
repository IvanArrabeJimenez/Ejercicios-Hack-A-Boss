package com.ivanarrabe.clase10dia11ejercicio1.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Partido implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombrePartido;
    private int cantidadVotos;

    public Partido() {
    }

    public Partido(String nombrePartido, int cantidadVotos) {
        this.nombrePartido = nombrePartido;
        this.cantidadVotos = 0;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public void incrementarVotos() {
        this.cantidadVotos++;
    }
    
    
}

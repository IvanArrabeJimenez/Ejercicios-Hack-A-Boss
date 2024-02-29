/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8dia9ejercicio2.logica;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ivan
 */
@Entity
public class Platillo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String receta;
    private double precio;

    //Constructor por defecto
    public Platillo() {
    }
    //Constructor con parámetros

    public Platillo(String nombre, String receta, double precio) {
        this.nombre = nombre;
        this.receta = receta;
        this.precio = precio;
    }

    //Metodos Getter y Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Platillo-> " + "id: " + id + ", nombre: " + nombre + ", receta: " + receta + ", precio: " + precio + "€";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase8dia9ejercicio2;

import com.mycompany.clase8dia9ejercicio2.logica.Platillo;
import com.mycompany.clase8dia9ejercicio2.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author ivan
 */
public class Clase8Dia9Ejercicio2 {

    public static void main(String[] args) {

        ControladoraPersistencia controlPersis = new ControladoraPersistencia();

        //Creamos un nuevo objeto platillo y lo damos de alta en la base de datos
        Platillo platillo = new Platillo("Macarrones con carne", "Cocer pasta y después añadir carne y tomate frito ", 12.50);

        //Creamos el platillo en la BBDD
        controlPersis.crearPlatillo(platillo);

        //Creamos dos platillos mas
        controlPersis.crearPlatillo(new Platillo("Guisantes con jamón", "Saltear los guisantes con jamón y ajo ", 9.90));
        controlPersis.crearPlatillo(new Platillo("Chuletón a la plancha", "Echar el chuletón a la plancha hasta el punto deseado y servir", 25.80));

        //Eliminamos el registro "Guisantes con jamón"
        controlPersis.borrarPlatillo(2L);

        //Editamos el precio del registro "Macarrones con carne"
        platillo.setNombre("Judías estofadas");
        platillo.setReceta("Cocer judías con otras verduras y estofarlas con carne de cerdo");
        platillo.setPrecio(15.60);
        controlPersis.modificarPlatillo(platillo);

        //Obtener de la base de datos los platillos restantes en la base de datos y mostrarlos por pantalla.        
        List<Platillo> listaPlatillos = controlPersis.traerPlatillo();
        System.out.println("LISTA DE RECETAS ALMACENADAS EN LA BASE DE DATOS:");
        for (Platillo listaPlatillo : listaPlatillos) {
            System.out.println(listaPlatillo.toString());
        }
    }
}

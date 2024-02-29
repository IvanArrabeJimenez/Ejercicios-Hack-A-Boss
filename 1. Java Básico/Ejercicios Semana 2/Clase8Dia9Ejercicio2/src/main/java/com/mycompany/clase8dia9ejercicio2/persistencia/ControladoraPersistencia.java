/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8dia9ejercicio2.persistencia;

import com.mycompany.clase8dia9ejercicio2.logica.Platillo;
import com.mycompany.clase8dia9ejercicio2.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivan
 */
public class ControladoraPersistencia {

    PlatilloJpaController platilloJPA = new PlatilloJpaController();

    public void crearPlatillo(Platillo platillo) {
        platilloJPA.create(platillo);
    }

    public void borrarPlatillo(Long id) {
        try {
            platilloJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Platillo> traerPlatillo() {
        return platilloJPA.findPlatilloEntities();
    }

    public void modificarPlatillo(Platillo platillo) {
        try {
            platilloJPA.edit(platillo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

package com.ivanArrabe.Clase7Dia8Ejercicio1.controller;

import com.ivanArrabe.Clase7Dia8Ejercicio1.model.Vehicle;
import com.ivanArrabe.Clase7Dia8Ejercicio1.service.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    /*He adjuntado en el proyecto un JSON con los datos de la lista de vehículos con la que he realizado las pruebas
    y también un JSON con la colección de postman para realizar las pruebas y comprobar que la app funciona correctamente.
     */

    @Autowired
    private IVehicleService vehicleService;

    @PostMapping
    public String addVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.addVehicle(vehicle);
        return "Vehículo añadido: " + vehicle.getBrand() + " " + vehicle.getModel();
    }

    @GetMapping
    public List<Vehicle> listVehicles() {
        return vehicleService.listVehicles();
    }

    @GetMapping("/prices")
    public List<Vehicle> listVehiclesPrices() {
        return vehicleService.listVehiclesPrices();
    }

    @GetMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable Long id) {
        return vehicleService.getVehicleById(id);
    }
}

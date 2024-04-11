package com.ivanArrabe.Clase7Dia8Ejercicio1.repository;

import com.ivanArrabe.Clase7Dia8Ejercicio1.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository {
    List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> listVehicles() {
        return vehicles;
    }
}

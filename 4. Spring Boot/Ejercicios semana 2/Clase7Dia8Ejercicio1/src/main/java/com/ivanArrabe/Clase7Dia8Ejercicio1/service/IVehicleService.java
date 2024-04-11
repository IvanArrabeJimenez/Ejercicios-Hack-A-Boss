package com.ivanArrabe.Clase7Dia8Ejercicio1.service;

import com.ivanArrabe.Clase7Dia8Ejercicio1.model.Vehicle;

import java.util.List;

public interface IVehicleService {
    public void addVehicle(Vehicle vehicle);

    public List<Vehicle> listVehicles();

    public List<Vehicle> listVehiclesPrices();

    public Vehicle getVehicleById(Long id);
}

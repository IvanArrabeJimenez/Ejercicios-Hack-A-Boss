package com.ivanArrabe.Clase7Dia8Ejercicio1.service;

import com.ivanArrabe.Clase7Dia8Ejercicio1.model.Vehicle;
import com.ivanArrabe.Clase7Dia8Ejercicio1.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class VehicleService implements IVehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.listVehicles().add(vehicle);
    }

    @Override
    public List<Vehicle> listVehicles() {
        return vehicleRepository.listVehicles();
    }

    @Override
    public List<Vehicle> listVehiclesPrices() {
        return vehicleRepository.listVehicles().stream()
                .sorted(Comparator.comparing(Vehicle::getPrice))
                .toList();
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.listVehicles().stream()
                .filter(v -> v.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

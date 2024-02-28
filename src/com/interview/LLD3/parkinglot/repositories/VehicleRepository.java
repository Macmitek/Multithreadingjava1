package com.interview.LLD3.parkinglot.repositories;


import com.interview.LLD3.parkinglot.models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {

    private Map<Long, Vehicle> vehicles = new TreeMap<>();
    private long previousId = 0;

    public Optional<Vehicle> findByNumber(String number) {
        return vehicles.values()
                .stream()
                .filter(vehicle -> vehicle.getNumber().equals(number))
                .findFirst();
    }

    public Vehicle save(Vehicle vehicle) {
        previousId += 1;
        vehicle.setId(previousId);
        vehicles.put(previousId, vehicle);
        return null;
    }
}

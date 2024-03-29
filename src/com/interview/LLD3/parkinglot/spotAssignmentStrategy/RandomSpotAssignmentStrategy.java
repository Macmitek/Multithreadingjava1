package com.interview.LLD3.parkinglot.spotAssignmentStrategy;


import com.interview.LLD3.parkinglot.exceptions.ParkingLotNotFoundException;
import com.interview.LLD3.parkinglot.models.*;
import com.interview.LLD3.parkinglot.repositories.ParkingLotRepository;

import java.util.Optional;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {

    private final ParkingLotRepository parkingLotRepository;

    public RandomSpotAssignmentStrategy(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public ParkingSpot getSpot(Gate gate, VehicleType vehicleType) {
        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findByGate(gate);
        if (parkingLotOptional.isEmpty()) {
            throw new ParkingLotNotFoundException();
        }

        for (ParkingFloor parkingFloor : parkingLotOptional.get().getParkingFloors()) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
                        parkingSpot.getSupportedVehicleTypes().contains(vehicleType)) {
                    return parkingSpot;
                }
            }
        }

        return null;
    }
}

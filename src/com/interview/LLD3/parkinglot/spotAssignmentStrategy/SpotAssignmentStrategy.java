package com.interview.LLD3.parkinglot.spotAssignmentStrategy;


import com.interview.LLD3.parkinglot.models.Gate;
import com.interview.LLD3.parkinglot.models.ParkingSpot;
import com.interview.LLD3.parkinglot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot getSpot(Gate gate, VehicleType vehicleType);
}

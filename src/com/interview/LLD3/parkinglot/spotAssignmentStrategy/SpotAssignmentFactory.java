package com.interview.LLD3.parkinglot.spotAssignmentStrategy;


import com.interview.LLD3.parkinglot.models.SpotAssignmentStrategyType;
import com.interview.LLD3.parkinglot.repositories.ParkingLotRepository;

public class SpotAssignmentFactory {

    private final ParkingLotRepository parkingLotRepository;

    public SpotAssignmentFactory(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public SpotAssignmentStrategy getSpotAssignmentStrategyByType(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        return switch (spotAssignmentStrategyType) {
            case RANDOM -> new RandomSpotAssignmentStrategy(parkingLotRepository);
            default -> new RandomSpotAssignmentStrategy(parkingLotRepository);
        };
    }
}

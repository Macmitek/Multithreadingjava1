package com.interview.LLD3.parkinglot;

import com.interview.LLD3.parkinglot.controllers.TicketController;
import com.interview.LLD3.parkinglot.repositories.GateRepository;
import com.interview.LLD3.parkinglot.repositories.ParkingLotRepository;
import com.interview.LLD3.parkinglot.repositories.TicketRepository;
import com.interview.LLD3.parkinglot.repositories.VehicleRepository;
import com.interview.LLD3.parkinglot.services.TicketService;
import com.interview.LLD3.parkinglot.spotAssignmentStrategy.SpotAssignmentFactory;

public class Client {
    public static void main(String[] args) {
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        GateRepository gateRepository = new GateRepository();
        SpotAssignmentFactory spotAssignmentFactory = new SpotAssignmentFactory(parkingLotRepository);


        TicketService ticketService = new TicketService(
                gateRepository,
                ticketRepository,
                vehicleRepository,
                parkingLotRepository,
                spotAssignmentFactory);

        TicketController ticketController = new TicketController(ticketService);

        System.out.println("Server has been started at port - 8080");

    }
}

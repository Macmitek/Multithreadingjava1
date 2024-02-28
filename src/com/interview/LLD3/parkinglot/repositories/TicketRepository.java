package com.interview.LLD3.parkinglot.repositories;


import com.interview.LLD3.parkinglot.models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {

    private Map<Long, Ticket> tickets = new TreeMap<>();
    private long previousId = 0;

    public Ticket save(Ticket ticket) {
        previousId += 1;
        ticket.setId(previousId);
        tickets.put(previousId, ticket);
        return ticket;
    }
}

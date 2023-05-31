package ru.air;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {
        int Time1 = t1.getTimeTo() - t1.getTimeFrom();
        int Time2 = t2.getTimeTo() - t2.getTimeFrom();
        return Time1 - Time2;

    }
}


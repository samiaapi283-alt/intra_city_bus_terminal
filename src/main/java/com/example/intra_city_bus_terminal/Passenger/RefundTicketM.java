package com.example.intra_city_bus_terminal.Passenger;

import java.time.LocalDate;

public class RefundTicketM {
    private String TicketID, Route, Status, Seatno;
    private LocalDate Date;

    public RefundTicketM(String ticketID, String route, String status, String seatno, LocalDate date) {
        TicketID = ticketID;
        Route = route;
        Status = status;
        Seatno = seatno;
        Date = date;
    }

    public String getTicketID() {
        return TicketID;
    }

    public void setTicketID(String ticketID) {
        TicketID = ticketID;
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String route) {
        Route = route;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getSeatno() {
        return Seatno;
    }

    public void setSeatno(String seatno) {
        Seatno = seatno;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "RefundTicketM{" +
                "TicketID='" + TicketID + '\'' +
                ", Route='" + Route + '\'' +
                ", Status='" + Status + '\'' +
                ", Seatno='" + Seatno + '\'' +
                ", Date=" + Date +
                '}';
    }
}

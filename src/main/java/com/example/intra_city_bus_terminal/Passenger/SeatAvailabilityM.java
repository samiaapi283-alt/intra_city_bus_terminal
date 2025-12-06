package com.example.intra_city_bus_terminal.Passenger;

import java.time.LocalDate;

public class SeatAvailabilityM {
    private String SelectedBus,From,Type,To;
    private LocalDate Date;

    public SeatAvailabilityM(String selectedBus, String from, String type, String to, LocalDate date) {
        SelectedBus = selectedBus;
        From = from;
        Type = type;
        To = to;
        Date = date;
    }

    public String getSelectedBus() {
        return SelectedBus;
    }

    public void setSelectedBus(String selectedBus) {
        SelectedBus = selectedBus;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "SeatAvailabilityM{" +
                "SelectedBus='" + SelectedBus + '\'' +
                ", From='" + From + '\'' +
                ", Type='" + Type + '\'' +
                ", To='" + To + '\'' +
                ", Date=" + Date +
                '}';
    }
}

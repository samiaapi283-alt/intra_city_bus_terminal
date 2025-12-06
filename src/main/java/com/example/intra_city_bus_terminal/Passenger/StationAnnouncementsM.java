package com.example.intra_city_bus_terminal.Passenger;

import java.time.LocalDate;

public class StationAnnouncementsM {
    private String BusNumber;
    private LocalDate Date;

    public StationAnnouncementsM(String busNumber, LocalDate date) {
        BusNumber = busNumber;
        Date = date;
    }

    public String getBusNumber() {
        return BusNumber;
    }

    public void setBusNumber(String busNumber) {
        BusNumber = busNumber;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "StationAnnouncementsM{" +
                "BusNumber='" + BusNumber + '\'' +
                ", Date=" + Date +
                '}';
    }
}

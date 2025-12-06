package com.example.intra_city_bus_terminal.Passenger;

import java.time.LocalDate;

public class LiveBusTrackingM {
    private String BusNumber, TiketNo;
    private LocalDate Date;

    public LiveBusTrackingM(String busNumber, String tiketNo, LocalDate date) {
        BusNumber = busNumber;
        TiketNo = tiketNo;
        Date = date;
    }

    public String getBusNumber() {
        return BusNumber;
    }

    public void setBusNumber(String busNumber) {
        BusNumber = busNumber;
    }

    public String getTiketNo() {
        return TiketNo;
    }

    public void setTiketNo(String tiketNo) {
        TiketNo = tiketNo;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "LiveBusTrackingM{" +
                "BusNumber='" + BusNumber + '\'' +
                ", TiketNo='" + TiketNo + '\'' +
                ", Date=" + Date +
                '}';
    }
}

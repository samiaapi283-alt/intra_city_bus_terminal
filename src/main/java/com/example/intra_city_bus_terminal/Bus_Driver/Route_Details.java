package com.example.intra_city_bus_terminal.Bus_Driver;

public class Route_Details {
    private String stopNo;
    private String stopName;
    private String arrivalTime;

    public Route_Details(String stopNo, String stopName, String arrivalTime) {
        this.stopNo = stopNo;
        this.stopName = stopName;
        this.arrivalTime = arrivalTime;
    }

    public String getStopNo() {
        return stopNo;
    }

    public String getStopName() {
        return stopName;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }
}

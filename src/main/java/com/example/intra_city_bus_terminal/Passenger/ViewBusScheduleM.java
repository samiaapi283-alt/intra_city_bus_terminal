package com.example.intra_city_bus_terminal.Passenger;

import java.time.LocalDate;

public class ViewBusScheduleM {
    private String route, From, To;
    private LocalDate date;

    public ViewBusScheduleM(String route, String from, String to, LocalDate date) {
        this.route = route;
        From = from;
        To = to;
        this.date = date;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ViewBusScheduleM{" +
                "route='" + route + '\'' +
                ", From='" + From + '\'' +
                ", To='" + To + '\'' +
                ", date=" + date +
                '}';
    }
}

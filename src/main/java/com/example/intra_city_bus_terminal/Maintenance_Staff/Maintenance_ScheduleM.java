package com.example.intra_city_bus_terminal.Maintenance_Staff;

import java.time.LocalDate;

public class Maintenance_ScheduleM {
    private String TeskName, Stasus, Area;
    private LocalDate Date;

    public Maintenance_ScheduleM(String teskName, String stasus, String area, LocalDate date) {
        TeskName = teskName;
        Stasus = stasus;
        Area = area;
        Date = date;
    }

    public String getTeskName() {
        return TeskName;
    }

    public void setTeskName(String teskName) {
        TeskName = teskName;
    }

    public String getStasus() {
        return Stasus;
    }

    public void setStasus(String stasus) {
        Stasus = stasus;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Maintenance_ScheduleM{" +
                "TeskName='" + TeskName + '\'' +
                ", Stasus='" + Stasus + '\'' +
                ", Area='" + Area + '\'' +
                ", Date=" + Date +
                '}';
    }
}

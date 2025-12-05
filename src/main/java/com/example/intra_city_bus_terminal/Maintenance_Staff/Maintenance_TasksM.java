package com.example.intra_city_bus_terminal.Maintenance_Staff;

import java.time.LocalDate;

public class Maintenance_TasksM {
    private String TeskName, Stasus, Area, Discription;
    private Integer TaskNo;

    public Maintenance_TasksM(String teskName, String stasus, String area, String discription, Integer taskNo) {
        TeskName = teskName;
        Stasus = stasus;
        Area = area;
        Discription = discription;
        TaskNo = taskNo;
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

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }

    public Integer getTaskNo() {
        return TaskNo;
    }

    public void setTaskNo(Integer taskNo) {
        TaskNo = taskNo;
    }

    @Override
    public String toString() {
        return "Maintenance_TasksM{" +
                "TeskName='" + TeskName + '\'' +
                ", Stasus='" + Stasus + '\'' +
                ", Area='" + Area + '\'' +
                ", Discription='" + Discription + '\'' +
                ", TaskNo=" + TaskNo +
                '}';
    }
}

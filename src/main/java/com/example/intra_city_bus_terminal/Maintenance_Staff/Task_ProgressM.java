package com.example.intra_city_bus_terminal.Maintenance_Staff;

import java.time.LocalDate;

public class Task_ProgressM {
    private String Select,TaskStatus;
    private LocalDate Date;

    public Task_ProgressM(String select, String taskStatus, LocalDate date) {
        Select = select;
        TaskStatus = taskStatus;
        Date = date;
    }

    public String getSelect() {
        return Select;
    }

    public void setSelect(String select) {
        Select = select;
    }

    public String getTaskStatus() {
        return TaskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        TaskStatus = taskStatus;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Task_ProgressM{" +
                "Select='" + Select + '\'' +
                ", TaskStatus='" + TaskStatus + '\'' +
                ", Date=" + Date +
                '}';
    }
}

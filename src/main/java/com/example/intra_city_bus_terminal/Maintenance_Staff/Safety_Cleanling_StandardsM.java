package com.example.intra_city_bus_terminal.Maintenance_Staff;

public class Safety_Cleanling_StandardsM {
    private String TaskName, Area, Status;
    private int TaskID;

    public Safety_Cleanling_StandardsM(String taskName, String area, String status, int taskID) {
        TaskName = taskName;
        Area = area;
        Status = status;
        TaskID = taskID;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getTaskID() {
        return TaskID;
    }

    public void setTaskID(int taskID) {
        TaskID = taskID;
    }

    @Override
    public String toString() {
        return "Safety_Cleanling_StandardsM{" +
                "TaskName='" + TaskName + '\'' +
                ", Area='" + Area + '\'' +
                ", Status='" + Status + '\'' +
                ", TaskID=" + TaskID +
                '}';
    }
}

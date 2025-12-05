package com.example.intra_city_bus_terminal.Maintenance_Staff;

public class Monitor_Equipment_PerformanceM {
    private String EquipmentName,Condition, Department, Issue;
    private int EquipmentQuentity;

    public Monitor_Equipment_PerformanceM(String equipmentName, String condition, String department, String issue, int equipmentQuentity) {
        EquipmentName = equipmentName;
        Condition = condition;
        Department = department;
        Issue = issue;
        EquipmentQuentity = equipmentQuentity;
    }

    public String getEquipmentName() {
        return EquipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        EquipmentName = equipmentName;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getIssue() {
        return Issue;
    }

    public void setIssue(String issue) {
        Issue = issue;
    }

    public int getEquipmentQuentity() {
        return EquipmentQuentity;
    }

    public void setEquipmentQuentity(int equipmentQuentity) {
        EquipmentQuentity = equipmentQuentity;
    }


    @Override
    public String toString() {
        return "Monitor_Equipment_PerformanceM{" +
                "EquipmentName='" + EquipmentName + '\'' +
                ", Condition='" + Condition + '\'' +
                ", Department='" + Department + '\'' +
                ", Issue='" + Issue + '\'' +
                ", EquipmentQuentity=" + EquipmentQuentity +
                '}';
    }
}

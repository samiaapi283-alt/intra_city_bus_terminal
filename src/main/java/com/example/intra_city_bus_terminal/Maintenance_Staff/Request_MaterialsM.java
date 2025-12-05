package com.example.intra_city_bus_terminal.Maintenance_Staff;

public class Request_MaterialsM {
    private String ToolName,Quantity;

    public Request_MaterialsM(String toolName, String quantity) {
        ToolName = toolName;
        Quantity = quantity;
    }

    public String getToolName() {
        return ToolName;
    }

    public void setToolName(String toolName) {
        ToolName = toolName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "Request_MaterialsM{" +
                "ToolName='" + ToolName + '\'' +
                ", Quantity='" + Quantity + '\'' +
                '}';
    }
}

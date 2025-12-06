package com.example.intra_city_bus_terminal.Bus_Driver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class Maintenance_Reminder
{
    @FXML
    private TableColumn<Maintenance_Reminder, String> serviceDateColumn;
    @FXML
    private Label outputLabel;
    @FXML
    private TableColumn<Maintenance_Reminder, String> statusColumn;
    @FXML
    private TableColumn<Maintenance_Reminder, String> serviceNameColumn;
    @FXML
    private TextField busNoTextField;

    @FXML
    public void initialize() {
        serviceDateColumn.setText("Service Date");
        statusColumn.setText("Status");
        serviceNameColumn.setText("Service Name");
    }

    @FXML
    public void maintenanceReminderOnClick(ActionEvent actionEvent) {
    }
}

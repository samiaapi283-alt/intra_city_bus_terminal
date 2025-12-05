package com.example.intra_city_bus_terminal.Bus_Driver;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class Maintenance_Reminder
{
    @javafx.fxml.FXML
    private TableColumn serviceDateColumn;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn serviceNameColumn;
    @javafx.fxml.FXML
    private TextField busNoTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void maintenanceReminderOnClick(ActionEvent actionEvent) {
    }
}
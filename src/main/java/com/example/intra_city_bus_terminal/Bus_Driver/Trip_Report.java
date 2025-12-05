package com.example.intra_city_bus_terminal.Bus_Driver;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Trip_Report
{
    @javafx.fxml.FXML
    private TextField fuelUsedTextField;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextArea remarksTextArea;
    @javafx.fxml.FXML
    private TextField totalDistanceTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitReportOnClick(ActionEvent actionEvent) {
    }
}
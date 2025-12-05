package com.example.intra_city_bus_terminal.Bus_Driver;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Trip_Status
{
    @javafx.fxml.FXML
    private TextField currentStatusTextField;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private ComboBox tripListComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ongoingOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void completedOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void departedOnClick(ActionEvent actionEvent) {
    }
}
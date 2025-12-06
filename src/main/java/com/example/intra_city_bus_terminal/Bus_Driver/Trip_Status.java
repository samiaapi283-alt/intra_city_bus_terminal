package com.example.intra_city_bus_terminal.Bus_Driver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Trip_Status
{
    @FXML
    private TextField currentStatusTextField;
    @FXML
    private Label outputLabel;
    @FXML
    private ComboBox<String> tripListComboBox;

    @FXML
    public void initialize() {
        tripListComboBox.getItems().addAll(
                "Trip-101",
                "Trip-102",
                "Trip-103"
        );
    }

    @FXML
    public void ongoingOnClick(ActionEvent actionEvent) {
        currentStatusTextField.setText("Ongoing");
        outputLabel.setText("Status updated to Ongoing");
    }

    @FXML
    public void completedOnClick(ActionEvent actionEvent) {
        currentStatusTextField.setText("Completed");
        outputLabel.setText("Status updated to Completed");
    }

    @FXML
    public void departedOnClick(ActionEvent actionEvent) {
        currentStatusTextField.setText("Departed");
        outputLabel.setText("Status updated to Departed");
    }
}

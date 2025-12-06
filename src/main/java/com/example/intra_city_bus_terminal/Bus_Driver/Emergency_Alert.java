package com.example.intra_city_bus_terminal.Bus_Driver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Emergency_Alert
{
    @FXML
    private TextArea shortMessageTextArea;
    @FXML
    private Label outputLabel;
    @FXML
    private ComboBox<String> alertTypeComboBox;

    @FXML
    public void initialize() {
        alertTypeComboBox.getItems().addAll(
                "Medical Emergency",
                "Fire Alert",
                "Mechanical Issue",
                "Suspicious Activity",
                "Road Block / Accident"
        );
    }

    @FXML
    public void sendAlertOnClick(ActionEvent actionEvent) {
    }
}

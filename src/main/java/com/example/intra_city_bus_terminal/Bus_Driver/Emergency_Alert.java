package com.example.intra_city_bus_terminal.Bus_Driver;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Emergency_Alert
{
    @javafx.fxml.FXML
    private TextArea shortMessageTextArea;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private ComboBox alertTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendAlertOnClick(ActionEvent actionEvent) {
    }
}
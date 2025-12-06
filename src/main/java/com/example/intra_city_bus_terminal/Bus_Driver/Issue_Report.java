package com.example.intra_city_bus_terminal.Bus_Driver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Issue_Report
{
    @FXML
    private ComboBox<String> issueTypeComboBox;
    @FXML
    private TextArea descriptiontextArea;

    @FXML
    public void initialize() {
        issueTypeComboBox.getItems().addAll(
                "Mechanical Problem",
                "Cleanliness Issue",
                "Driver Behavior",
                "Delay / Timing Issue",
                "Safety Concern",
                "Other"
        );
    }

    @FXML
    public void submitReportOnClick(ActionEvent actionEvent) {
    }
}

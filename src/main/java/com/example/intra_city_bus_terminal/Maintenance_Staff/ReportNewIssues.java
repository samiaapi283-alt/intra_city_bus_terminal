package com.example.intra_city_bus_terminal.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReportNewIssues
{
    @javafx.fxml.FXML
    private TextField IssueLocationTF;
    @javafx.fxml.FXML
    private TextArea IssueDescriptionTA;
    @javafx.fxml.FXML
    private DatePicker IssueDateDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SubmitIssueOA(ActionEvent actionEvent) {
    }
}
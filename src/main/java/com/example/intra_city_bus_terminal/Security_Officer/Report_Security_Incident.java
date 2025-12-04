package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class Report_Security_Incident
{
    @javafx.fxml.FXML
    private TableColumn <Report_Security_Incident, String> OfficerIDTC;
    @javafx.fxml.FXML
    private ComboBox <String> IncidentTypeComboBox;
    @javafx.fxml.FXML
    private TextField LocationTextField;
    @javafx.fxml.FXML
    private TextField DescriptionTextField;
    @javafx.fxml.FXML
    private TableColumn <Report_Security_Incident, LocalDate> DateTC;
    @javafx.fxml.FXML
    private TextField OfficerIDTextField;
    @javafx.fxml.FXML
    private TableView <Report_Security_Incident> IncidentTableView;
    @javafx.fxml.FXML
    private ComboBox <String> SeverityComboBox;
    @javafx.fxml.FXML
    private TableColumn <Report_Security_Incident, String> SeverityTC;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TableColumn <Report_Security_Incident, String> LocationTC;
    @javafx.fxml.FXML
    private TableColumn <Report_Security_Incident, String> IncidentTypeTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LogIncidentOnAction(ActionEvent actionEvent) {
    }
}
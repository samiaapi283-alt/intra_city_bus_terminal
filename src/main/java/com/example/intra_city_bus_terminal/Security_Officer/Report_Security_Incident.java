package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
        IncidentTypeComboBox.getItems().addAll("Unauthorized access", "Vandalism", "Pickpocketing", "Disorderly Passenger" );
        SeverityComboBox.getItems().addAll("Normal", "Low", "Medium", "High");
        SeverityComboBox.getSelectionModel().selectFirst();
        IncidentTypeComboBox.getSelectionModel().selectFirst();

        IncidentTypeTC.setCellValueFactory(new PropertyValueFactory<>("IncidentTypeComboBox"));
        IncidentTypeTC.setEditable(true);
        SeverityTC.setCellValueFactory(new PropertyValueFactory<>("SeverityTC"));
        SeverityTC.setEditable(true);
        DatePicker.setValue(LocalDate.now());
        DatePicker.setEditable(true);
        LocationTextField.setText("Location");
        LocationTextField.setEditable(true);
        DescriptionTextField.setText("Description");
        DescriptionTextField.setEditable(true);
        DateTC.setCellValueFactory(new PropertyValueFactory<>("DateTC"));
        DateTC.setEditable(true);
        OfficerIDTextField.setText("OfficerID");
        OfficerIDTextField.setEditable(true);



        }

    @javafx.fxml.FXML
    public void LogIncidentOnAction(ActionEvent actionEvent) {
    }

    public Report_Security_Incident(TableColumn<Report_Security_Incident, String> officerIDTC, TextField locationTextField, ComboBox<String> incidentTypeComboBox, TextField descriptionTextField, TableColumn<Report_Security_Incident, LocalDate> dateTC, TextField officerIDTextField, TableView<Report_Security_Incident> incidentTableView, ComboBox<String> severityComboBox, TableColumn<Report_Security_Incident, String> severityTC, DatePicker datePicker, TableColumn<Report_Security_Incident, String> locationTC, TableColumn<Report_Security_Incident, String> incidentTypeTC) {
        OfficerIDTC = officerIDTC;
        LocationTextField = locationTextField;
        IncidentTypeComboBox = incidentTypeComboBox;
        DescriptionTextField = descriptionTextField;
        DateTC = dateTC;
        OfficerIDTextField = officerIDTextField;
        IncidentTableView = incidentTableView;
        SeverityComboBox = severityComboBox;
        SeverityTC = severityTC;
        DatePicker = datePicker;
        LocationTC = locationTC;
        IncidentTypeTC = incidentTypeTC;
    }

    public TableColumn<Report_Security_Incident, String> getOfficerIDTC() {
        return OfficerIDTC;
    }

    public void setOfficerIDTC(TableColumn<Report_Security_Incident, String> officerIDTC) {
        OfficerIDTC = officerIDTC;
    }

    public ComboBox<String> getIncidentTypeComboBox() {
        return IncidentTypeComboBox;
    }

    public void setIncidentTypeComboBox(ComboBox<String> incidentTypeComboBox) {
        IncidentTypeComboBox = incidentTypeComboBox;
    }

    public TextField getLocationTextField() {
        return LocationTextField;
    }

    public void setLocationTextField(TextField locationTextField) {
        LocationTextField = locationTextField;
    }

    public TextField getDescriptionTextField() {
        return DescriptionTextField;
    }

    public void setDescriptionTextField(TextField descriptionTextField) {
        DescriptionTextField = descriptionTextField;
    }

    public TableColumn<Report_Security_Incident, LocalDate> getDateTC() {
        return DateTC;
    }

    public void setDateTC(TableColumn<Report_Security_Incident, LocalDate> dateTC) {
        DateTC = dateTC;
    }

    public TextField getOfficerIDTextField() {
        return OfficerIDTextField;
    }

    public void setOfficerIDTextField(TextField officerIDTextField) {
        OfficerIDTextField = officerIDTextField;
    }

    public TableView<Report_Security_Incident> getIncidentTableView() {
        return IncidentTableView;
    }

    public void setIncidentTableView(TableView<Report_Security_Incident> incidentTableView) {
        IncidentTableView = incidentTableView;
    }

    public ComboBox<String> getSeverityComboBox() {
        return SeverityComboBox;
    }

    public void setSeverityComboBox(ComboBox<String> severityComboBox) {
        SeverityComboBox = severityComboBox;
    }

    public TableColumn<Report_Security_Incident, String> getSeverityTC() {
        return SeverityTC;
    }

    public void setSeverityTC(TableColumn<Report_Security_Incident, String> severityTC) {
        SeverityTC = severityTC;
    }

    public DatePicker getDatePicker() {
        return DatePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        DatePicker = datePicker;
    }

    public TableColumn<Report_Security_Incident, String> getLocationTC() {
        return LocationTC;
    }

    public void setLocationTC(TableColumn<Report_Security_Incident, String> locationTC) {
        LocationTC = locationTC;
    }

    public TableColumn<Report_Security_Incident, String> getIncidentTypeTC() {
        return IncidentTypeTC;
    }

    public void setIncidentTypeTC(TableColumn<Report_Security_Incident, String> incidentTypeTC) {
        IncidentTypeTC = incidentTypeTC;
    }

    @Override
    public String toString() {
        return "Report_Security_Incident{" +
                "OfficerIDTC=" + OfficerIDTC +
                ", IncidentTypeComboBox=" + IncidentTypeComboBox +
                ", LocationTextField=" + LocationTextField +
                ", DescriptionTextField=" + DescriptionTextField +
                ", DateTC=" + DateTC +
                ", OfficerIDTextField=" + OfficerIDTextField +
                ", IncidentTableView=" + IncidentTableView +
                ", SeverityComboBox=" + SeverityComboBox +
                ", SeverityTC=" + SeverityTC +
                ", DatePicker=" + DatePicker +
                ", LocationTC=" + LocationTC +
                ", IncidentTypeTC=" + IncidentTypeTC +
                '}';
    }
}
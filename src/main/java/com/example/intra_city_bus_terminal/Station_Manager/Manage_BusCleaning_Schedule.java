package com.example.intra_city_bus_terminal.Station_Manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class Manage_BusCleaning_Schedule
{
    @javafx.fxml.FXML
    private TextField CleanerID;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TableColumn <Manage_BusCleaning_Schedule, String> CleanerNameTC;
    @javafx.fxml.FXML
    private TableColumn <Manage_BusCleaning_Schedule, String> BusNumberTC;
    @javafx.fxml.FXML
    private TableColumn <Manage_BusCleaning_Schedule, String> CleanerIDTC;
    @javafx.fxml.FXML
    private TableView <Manage_BusCleaning_Schedule> Tableview;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TextField CleanerName;
    @javafx.fxml.FXML
    private TableColumn <Manage_BusCleaning_Schedule, DatePicker> DateTC;
    @javafx.fxml.FXML
    private ComboBox <String> BusNumberComboBOX;

    @javafx.fxml.FXML
    public void initialize() {
        BusNumberComboBOX.getItems().addAll("1", "2", "3", "4", "5", "6",  "7", "8", "9");
        BusNumberComboBOX.getSelectionModel().selectFirst();
    }

    @javafx.fxml.FXML
    public void SaveOnAction(ActionEvent actionEvent) {
    }

    public Manage_BusCleaning_Schedule(TextField cleanerID, Label outputLabel, TableColumn<Manage_BusCleaning_Schedule, String> cleanerNameTC, TableColumn<Manage_BusCleaning_Schedule, String> busNumberTC, TableColumn<Manage_BusCleaning_Schedule, String> cleanerIDTC, TableView<Manage_BusCleaning_Schedule> tableview, DatePicker datePicker, TextField cleanerName, TableColumn<Manage_BusCleaning_Schedule, DatePicker> dateTC, ComboBox<String> busNumberComboBOX) {
        CleanerID = cleanerID;
        OutputLabel = outputLabel;
        CleanerNameTC = cleanerNameTC;
        BusNumberTC = busNumberTC;
        CleanerIDTC = cleanerIDTC;
        Tableview = tableview;
        DatePicker = datePicker;
        CleanerName = cleanerName;
        DateTC = dateTC;
        BusNumberComboBOX = busNumberComboBOX;
    }

    public TextField getCleanerID() {
        return CleanerID;
    }

    public void setCleanerID(TextField cleanerID) {
        CleanerID = cleanerID;
    }

    public Label getOutputLabel() {
        return OutputLabel;
    }

    public void setOutputLabel(Label outputLabel) {
        OutputLabel = outputLabel;
    }

    public TableColumn<Manage_BusCleaning_Schedule, String> getCleanerNameTC() {
        return CleanerNameTC;
    }

    public void setCleanerNameTC(TableColumn<Manage_BusCleaning_Schedule, String> cleanerNameTC) {
        CleanerNameTC = cleanerNameTC;
    }

    public TableColumn<Manage_BusCleaning_Schedule, String> getBusNumberTC() {
        return BusNumberTC;
    }

    public void setBusNumberTC(TableColumn<Manage_BusCleaning_Schedule, String> busNumberTC) {
        BusNumberTC = busNumberTC;
    }

    public TableColumn<Manage_BusCleaning_Schedule, String> getCleanerIDTC() {
        return CleanerIDTC;
    }

    public void setCleanerIDTC(TableColumn<Manage_BusCleaning_Schedule, String> cleanerIDTC) {
        CleanerIDTC = cleanerIDTC;
    }

    public TableView<Manage_BusCleaning_Schedule> getTableview() {
        return Tableview;
    }

    public void setTableview(TableView<Manage_BusCleaning_Schedule> tableview) {
        Tableview = tableview;
    }

    public DatePicker getDatePicker() {
        return DatePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        DatePicker = datePicker;
    }

    public TextField getCleanerName() {
        return CleanerName;
    }

    public void setCleanerName(TextField cleanerName) {
        CleanerName = cleanerName;
    }

    public TableColumn<Manage_BusCleaning_Schedule, DatePicker> getDateTC() {
        return DateTC;
    }

    public void setDateTC(TableColumn<Manage_BusCleaning_Schedule, DatePicker> dateTC) {
        DateTC = dateTC;
    }

    public ComboBox<String> getBusNumberComboBOX() {
        return BusNumberComboBOX;
    }

    public void setBusNumberComboBOX(ComboBox<String> busNumberComboBOX) {
        BusNumberComboBOX = busNumberComboBOX;
    }

    @Override
    public String toString() {
        return "Manage_BusCleaning_Schedule{" +
                "CleanerID=" + CleanerID +
                ", OutputLabel=" + OutputLabel +
                ", CleanerNameTC=" + CleanerNameTC +
                ", BusNumberTC=" + BusNumberTC +
                ", CleanerIDTC=" + CleanerIDTC +
                ", Tableview=" + Tableview +
                ", DatePicker=" + DatePicker +
                ", CleanerName=" + CleanerName +
                ", DateTC=" + DateTC +
                ", BusNumberComboBOX=" + BusNumberComboBOX +
                '}';
    }
}
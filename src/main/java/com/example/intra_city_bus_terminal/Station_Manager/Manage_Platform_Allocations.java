package com.example.intra_city_bus_terminal.Station_Manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class Manage_Platform_Allocations
{
    @javafx.fxml.FXML
    private TextField BusNumberTF;
    @javafx.fxml.FXML
    private TableColumn <Manage_Platform_Allocations, String> BusNumberTC;
    @javafx.fxml.FXML
    private TableView <Manage_Platform_Allocations> Tableview;
    @javafx.fxml.FXML
    private ComboBox <String> PlatformNumberCB;
    @javafx.fxml.FXML
    private TableColumn <Manage_Platform_Allocations, String> PlatformNumberTC;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TableColumn <Manage_Platform_Allocations, LocalDate>DateTC;
    @javafx.fxml.FXML
    private ComboBox <String> TimeCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AllocatePlatformOnAction(ActionEvent actionEvent) {
    }

    public Manage_Platform_Allocations(TextField busNumberTF, TableColumn<Manage_Platform_Allocations, String> busNumberTC, TableView<Manage_Platform_Allocations> tableview, ComboBox<String> platformNumberCB, TableColumn<Manage_Platform_Allocations, LocalDate> dateTC, DatePicker datePicker, TableColumn<Manage_Platform_Allocations, String> platformNumberTC, ComboBox<String> timeCB) {
        BusNumberTF = busNumberTF;
        BusNumberTC = busNumberTC;
        Tableview = tableview;
        PlatformNumberCB = platformNumberCB;
        DateTC = dateTC;
        DatePicker = datePicker;
        PlatformNumberTC = platformNumberTC;
        TimeCB = timeCB;
    }

    public TextField getBusNumberTF() {
        return BusNumberTF;
    }

    public void setBusNumberTF(TextField busNumberTF) {
        BusNumberTF = busNumberTF;
    }

    public TableColumn<Manage_Platform_Allocations, String> getBusNumberTC() {
        return BusNumberTC;
    }

    public void setBusNumberTC(TableColumn<Manage_Platform_Allocations, String> busNumberTC) {
        BusNumberTC = busNumberTC;
    }

    public TableView<Manage_Platform_Allocations> getTableview() {
        return Tableview;
    }

    public void setTableview(TableView<Manage_Platform_Allocations> tableview) {
        Tableview = tableview;
    }

    public TableColumn<Manage_Platform_Allocations, String> getPlatformNumberTC() {
        return PlatformNumberTC;
    }

    public void setPlatformNumberTC(TableColumn<Manage_Platform_Allocations, String> platformNumberTC) {
        PlatformNumberTC = platformNumberTC;
    }

    public ComboBox<String> getPlatformNumberCB() {
        return PlatformNumberCB;
    }

    public void setPlatformNumberCB(ComboBox<String> platformNumberCB) {
        PlatformNumberCB = platformNumberCB;
    }

    public DatePicker getDatePicker() {
        return DatePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        DatePicker = datePicker;
    }

    public TableColumn<Manage_Platform_Allocations, LocalDate> getDateTC() {
        return DateTC;
    }

    public void setDateTC(TableColumn<Manage_Platform_Allocations, LocalDate> dateTC) {
        DateTC = dateTC;
    }

    public ComboBox<String> getTimeCB() {
        return TimeCB;
    }

    public void setTimeCB(ComboBox<String> timeCB) {
        TimeCB = timeCB;
    }

    @Override
    public String toString() {
        return "Manage_Platform_Allocations{" +
                "BusNumberTF=" + BusNumberTF +
                ", BusNumberTC=" + BusNumberTC +
                ", Tableview=" + Tableview +
                ", PlatformNumberCB=" + PlatformNumberCB +
                ", PlatformNumberTC=" + PlatformNumberTC +
                ", DatePicker=" + DatePicker +
                ", DateTC=" + DateTC +
                ", TimeCB=" + TimeCB +
                '}';
    }
}
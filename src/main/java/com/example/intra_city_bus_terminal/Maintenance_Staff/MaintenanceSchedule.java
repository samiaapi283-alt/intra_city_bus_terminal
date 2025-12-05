package com.example.intra_city_bus_terminal.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class MaintenanceSchedule
{
    @javafx.fxml.FXML
    private TableColumn <MaintenanceSchedule,String> TaskNameTC;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceSchedule,String> StatusTC;
    @javafx.fxml.FXML
    private ComboBox<String> StatusCB;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceSchedule,DatePicker> DateTC;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceSchedule,String> AreaTC;
    @javafx.fxml.FXML
    private ComboBox <String>AreaCB;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private TextField TaskNameTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RequestAdjustmentOA(ActionEvent actionEvent) {
    }
}
package com.example.intra_city_bus_terminal.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SafetyCleanlingStandards
{
    @javafx.fxml.FXML
    private TextField TaskIDTF;
    @javafx.fxml.FXML
    private TableColumn <SafetyCleanlingStandards, String> TaskNameTC;
    @javafx.fxml.FXML
    private ComboBox <String>StatusCB;
    @javafx.fxml.FXML
    private TableColumn <SafetyCleanlingStandards, String> StatusTC;
    @javafx.fxml.FXML
    private TableColumn <SafetyCleanlingStandards, String> AreaTC;
    @javafx.fxml.FXML
    private TableColumn <SafetyCleanlingStandards, String> TaskIDTC;
    @javafx.fxml.FXML
    private TextField TaskNameTF;
    @javafx.fxml.FXML
    private TextField AreaTF;

    @javafx.fxml.FXML
    public void initialize() {


        StatusCB.getItems().addAll("Finish","Start later","importent");

        TaskNameTC.setCellValueFactory(new PropertyValueFactory<>("CardNo"));
        StatusTC.setCellValueFactory(new PropertyValueFactory<>("HolderName"));
        AreaTC.setCellValueFactory(new PropertyValueFactory<>("GateWayName"));
        TaskIDTC.setCellValueFactory(new PropertyValueFactory<>("GateWayName"));



    }

    @javafx.fxml.FXML
    public void MarkCompletedOA(ActionEvent actionEvent) {
    }
}
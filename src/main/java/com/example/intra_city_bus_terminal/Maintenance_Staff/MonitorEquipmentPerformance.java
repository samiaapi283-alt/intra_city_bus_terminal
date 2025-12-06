package com.example.intra_city_bus_terminal.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MonitorEquipmentPerformance
{
    @javafx.fxml.FXML
    private TableColumn <MonitorEquipmentPerformance,String>  EquipmentQuentityTC;
    @javafx.fxml.FXML
    private TextField DepartmentTF;
    @javafx.fxml.FXML
    private TextField EquipmentQuentityTF;
    @javafx.fxml.FXML
    private TextField EquipmentQuentity_TF;
    @javafx.fxml.FXML
    private TableColumn <MonitorEquipmentPerformance,String> DepartmentTC;
    @javafx.fxml.FXML
    private TextArea IssuesTA;
    @javafx.fxml.FXML
    private TableColumn <MonitorEquipmentPerformance,String> EquipmentNameTC;

    @javafx.fxml.FXML
    public void initialize() {


        EquipmentQuentityTC.setCellValueFactory(new PropertyValueFactory<>("CardNo"));
        DepartmentTC.setCellValueFactory(new PropertyValueFactory<>("HolderName"));
        EquipmentNameTC.setCellValueFactory(new PropertyValueFactory<>("HolderName"));
    }

}
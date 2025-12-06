package com.example.intra_city_bus_terminal.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MaintenanceTasks
{
    @javafx.fxml.FXML
    private TextField TaskIDTF;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTasks,String> TaskNameTC;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceTasks,String>  StatusTC;
    @javafx.fxml.FXML
    private ComboBox<String>  StatusCB;
    @javafx.fxml.FXML
    private TextArea DescriptionTA;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceTasks,String>  AreaTC;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceTasks,String>  TaskIDTC;
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

    }

    @javafx.fxml.FXML
    public void StartTaskOA(ActionEvent actionEvent) {
    }
}
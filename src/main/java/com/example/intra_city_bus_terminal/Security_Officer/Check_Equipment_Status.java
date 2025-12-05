package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class Check_Equipment_Status
{
    @javafx.fxml.FXML
    private ComboBox <String> LocationComboBox;
    @javafx.fxml.FXML
    private TextField EquipmentTypeTextField;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private TableColumn <Check_Equipment_Status, LocalDate> DateTC;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TableColumn <Check_Equipment_Status, String> LocationTC;
    @javafx.fxml.FXML
    private TableColumn <Check_Equipment_Status, String> TypeTC;
    @javafx.fxml.FXML
    private TableView <Check_Equipment_Status> TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ViewStatusOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RequestServiceOnAction(ActionEvent actionEvent) {
    }
}
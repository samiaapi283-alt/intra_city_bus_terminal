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

    public Check_Equipment_Status(ComboBox<String> locationComboBox, TextField equipmentTypeTextField, Label outputLabel, MenuBar menuBar, TableColumn<Check_Equipment_Status, LocalDate> dateTC, DatePicker datePicker, TableColumn<Check_Equipment_Status, String> locationTC, TableView<Check_Equipment_Status> tableView, TableColumn<Check_Equipment_Status, String> typeTC) {
        LocationComboBox = locationComboBox;
        EquipmentTypeTextField = equipmentTypeTextField;
        OutputLabel = outputLabel;
        MenuBar = menuBar;
        DateTC = dateTC;
        DatePicker = datePicker;
        LocationTC = locationTC;
        TableView = tableView;
        TypeTC = typeTC;
    }

    public ComboBox<String> getLocationComboBox() {
        return LocationComboBox;
    }

    public void setLocationComboBox(ComboBox<String> locationComboBox) {
        LocationComboBox = locationComboBox;
    }

    public TextField getEquipmentTypeTextField() {
        return EquipmentTypeTextField;
    }

    public void setEquipmentTypeTextField(TextField equipmentTypeTextField) {
        EquipmentTypeTextField = equipmentTypeTextField;
    }

    public Label getOutputLabel() {
        return OutputLabel;
    }

    public void setOutputLabel(Label outputLabel) {
        OutputLabel = outputLabel;
    }

    public MenuBar getMenuBar() {
        return MenuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        MenuBar = menuBar;
    }

    public TableColumn<Check_Equipment_Status, LocalDate> getDateTC() {
        return DateTC;
    }

    public void setDateTC(TableColumn<Check_Equipment_Status, LocalDate> dateTC) {
        DateTC = dateTC;
    }

    public DatePicker getDatePicker() {
        return DatePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        DatePicker = datePicker;
    }

    public TableColumn<Check_Equipment_Status, String> getTypeTC() {
        return TypeTC;
    }

    public void setTypeTC(TableColumn<Check_Equipment_Status, String> typeTC) {
        TypeTC = typeTC;
    }

    public TableColumn<Check_Equipment_Status, String> getLocationTC() {
        return LocationTC;
    }

    public void setLocationTC(TableColumn<Check_Equipment_Status, String> locationTC) {
        LocationTC = locationTC;
    }

    public TableView<Check_Equipment_Status> getTableView() {
        return TableView;
    }

    public void setTableView(TableView<Check_Equipment_Status> tableView) {
        TableView = tableView;
    }

    @Override
    public String toString() {
        return "Check_Equipment_Status{" +
                "LocationComboBox=" + LocationComboBox +
                ", EquipmentTypeTextField=" + EquipmentTypeTextField +
                ", OutputLabel=" + OutputLabel +
                ", MenuBar=" + MenuBar +
                ", DateTC=" + DateTC +
                ", DatePicker=" + DatePicker +
                ", LocationTC=" + LocationTC +
                ", TypeTC=" + TypeTC +
                ", TableView=" + TableView +
                '}';
    }

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
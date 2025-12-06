package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Restricted_Area
{
    @javafx.fxml.FXML
    private TableColumn <Restricted_Area, String> OfficerIDTC;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TableView <Restricted_Area> RestrictedAreaTableView;
    @javafx.fxml.FXML
    private TableColumn <Restricted_Area, String> StatusTC;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private TableColumn <Restricted_Area, DatePicker> DateTC;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TextField OfficerIDTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RequestaccessOnAction(ActionEvent actionEvent) {
    }

    public Restricted_Area(TableColumn<Restricted_Area, String> officerIDTC, Label outputLabel, TableView<Restricted_Area> restrictedAreaTableView, TableColumn<Restricted_Area, String> statusTC, MenuBar menuBar, TableColumn<Restricted_Area, DatePicker> dateTC, DatePicker datePicker, TextField officerIDTextField) {
        OfficerIDTC = officerIDTC;
        OutputLabel = outputLabel;
        RestrictedAreaTableView = restrictedAreaTableView;
        StatusTC = statusTC;
        MenuBar = menuBar;
        DateTC = dateTC;
        DatePicker = datePicker;
        OfficerIDTextField = officerIDTextField;
    }

    public TableColumn<Restricted_Area, String> getOfficerIDTC() {
        return OfficerIDTC;
    }

    public void setOfficerIDTC(TableColumn<Restricted_Area, String> officerIDTC) {
        OfficerIDTC = officerIDTC;
    }

    public Label getOutputLabel() {
        return OutputLabel;
    }

    public void setOutputLabel(Label outputLabel) {
        OutputLabel = outputLabel;
    }

    public TableView<Restricted_Area> getRestrictedAreaTableView() {
        return RestrictedAreaTableView;
    }

    public void setRestrictedAreaTableView(TableView<Restricted_Area> restrictedAreaTableView) {
        RestrictedAreaTableView = restrictedAreaTableView;
    }

    public TableColumn<Restricted_Area, String> getStatusTC() {
        return StatusTC;
    }

    public void setStatusTC(TableColumn<Restricted_Area, String> statusTC) {
        StatusTC = statusTC;
    }

    public MenuBar getMenuBar() {
        return MenuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        MenuBar = menuBar;
    }

    public TableColumn<Restricted_Area, DatePicker> getDateTC() {
        return DateTC;
    }

    public void setDateTC(TableColumn<Restricted_Area, DatePicker> dateTC) {
        DateTC = dateTC;
    }

    public DatePicker getDatePicker() {
        return DatePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        DatePicker = datePicker;
    }

    public TextField getOfficerIDTextField() {
        return OfficerIDTextField;
    }

    public void setOfficerIDTextField(TextField officerIDTextField) {
        OfficerIDTextField = officerIDTextField;
    }

    @Override
    public String toString() {
        return "Restricted_Area{" +
                "OfficerIDTC=" + OfficerIDTC +
                ", OutputLabel=" + OutputLabel +
                ", RestrictedAreaTableView=" + RestrictedAreaTableView +
                ", StatusTC=" + StatusTC +
                ", MenuBar=" + MenuBar +
                ", DateTC=" + DateTC +
                ", DatePicker=" + DatePicker +
                ", OfficerIDTextField=" + OfficerIDTextField +
                '}';
    }
}
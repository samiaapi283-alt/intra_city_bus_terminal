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
}
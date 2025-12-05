package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class View_SecurityStaff_List
{
    @javafx.fxml.FXML
    private TableColumn <View_SecurityStaff_List, String> StaffIDTC;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private TableView <View_SecurityStaff_List> Tableview;
    @javafx.fxml.FXML
    private TableColumn <View_SecurityStaff_List, DatePicker> DateTC;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TextField SatffIDTextField;
    @javafx.fxml.FXML
    private TextField StaffNameTextField;
    @javafx.fxml.FXML
    private TableColumn <View_SecurityStaff_List, String> AvailabilityTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SearchOnAction(ActionEvent actionEvent) {
    }
}
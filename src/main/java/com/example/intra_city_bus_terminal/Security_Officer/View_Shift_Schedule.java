package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class View_Shift_Schedule
{
    @javafx.fxml.FXML
    private TableColumn <View_Shift_Schedule, String> OfficerIDTC;
    @javafx.fxml.FXML
    private TableColumn <View_Shift_Schedule, String> DutyLocationTC;
    @javafx.fxml.FXML
    private TableColumn <View_Shift_Schedule, String> DutyTimeTC;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TableView <View_Shift_Schedule> TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SearchOnAction(ActionEvent actionEvent) {
    }
}
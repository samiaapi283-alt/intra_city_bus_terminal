package com.example.intra_city_bus_terminal.Passenger;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;

import java.time.LocalDate;

public class ViewBusSchedule
{
    @javafx.fxml.FXML
    private TableColumn<ViewBusSchedule,String> FromTC;
    @javafx.fxml.FXML
    private ComboBox<String>FromCB;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn<ViewBusSchedule, LocalDate> dateTC;
    @javafx.fxml.FXML
    private TableColumn<ViewBusSchedule,String> ToTC;
    @javafx.fxml.FXML
    private ComboBox<String> ToCB;
    @javafx.fxml.FXML
    private ComboBox<String> routeCB;
    @javafx.fxml.FXML
    private TableColumn<ViewBusSchedule,String> routeTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SearchOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewDetailsOA(ActionEvent actionEvent) {
    }
}
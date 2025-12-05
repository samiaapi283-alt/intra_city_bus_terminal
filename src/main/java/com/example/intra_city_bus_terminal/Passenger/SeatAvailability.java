package com.example.intra_city_bus_terminal.Passenger;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

public class SeatAvailability
{
    @javafx.fxml.FXML
    private ComboBox<String> FromCB;
    @javafx.fxml.FXML
    private ComboBox<String> SelectedBusCB;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private ComboBox<String> TypeCB;
    @javafx.fxml.FXML
    private ComboBox<String> ToCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void CheckSeatOA(ActionEvent actionEvent) {
    }
}
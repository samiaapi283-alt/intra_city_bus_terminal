package com.example.intra_city_bus_terminal.Ticketing_Staff;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Manage_ticket_bookingsController
{
    @javafx.fxml.FXML
    private TextField phoneNumberTextField;
    @javafx.fxml.FXML
    private ComboBox busTypeComboBox;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField passengerNameTextField;
    @javafx.fxml.FXML
    private ComboBox departureCityComboBox;
    @javafx.fxml.FXML
    private ComboBox destinationCityComboBox;
    @javafx.fxml.FXML
    private DatePicker travelDateDp;
    @javafx.fxml.FXML
    private ComboBox seatNumberComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveBookingsOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkAvailabilityOnClick(ActionEvent actionEvent) {
    }
}
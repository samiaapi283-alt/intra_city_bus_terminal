package com.example.intra_city_bus_terminal.Ticketing_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Manage_ticket_bookingsController
{
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private ComboBox<String> busTypeComboBox;
    @FXML
    private Label outputLabel;
    @FXML
    private TextField passengerNameTextField;
    @FXML
    private ComboBox<String> departureCityComboBox;
    @FXML
    private ComboBox<String> destinationCityComboBox;
    @FXML
    private DatePicker travelDateDp;
    @FXML
    private ComboBox<String> seatNumberComboBox;

    @FXML
    public void initialize() {
        busTypeComboBox.getItems().addAll("AC", "Non-AC", "Sleeper", "Semi-Sleeper");
        departureCityComboBox.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Khulna");
        destinationCityComboBox.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Khulna");
        seatNumberComboBox.getItems().addAll("1A", "1B", "2A", "2B", "3A", "3B");
    }

    @FXML
    public void saveBookingsOnClick(ActionEvent actionEvent) {
        outputLabel.setText("Booking saved successfully.");
    }

    @FXML
    public void checkAvailabilityOnClick(ActionEvent actionEvent) {
        outputLabel.setText("Seat availability checked.");
    }
}

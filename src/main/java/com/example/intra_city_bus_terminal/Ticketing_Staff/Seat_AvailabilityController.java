package com.example.intra_city_bus_terminal.Ticketing_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class Seat_AvailabilityController {

    @FXML
    private TextField SeatNoTextField;

    @FXML
    private Label outputLabel;

    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private ComboBox<String> busListComboBox;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private DatePicker TravelDateDP;

    @FXML
    private TableColumn<?, ?> seatNoColumn;

    @FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Available", "Booked", "Reserved", "Blocked");
        busListComboBox.getItems().addAll("Bus-101", "Bus-102", "Bus-103", "Bus-104");
    }

    @FXML
    public void saveChangesOnClick(ActionEvent actionEvent) {
    }

    @FXML
    public void loadSeatsOnClick(ActionEvent actionEvent) {
    }

    @FXML
    public void updateSeatOnClick(ActionEvent actionEvent) {
    }
}

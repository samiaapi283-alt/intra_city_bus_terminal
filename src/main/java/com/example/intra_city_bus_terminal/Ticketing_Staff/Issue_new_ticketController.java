package com.example.intra_city_bus_terminal.Ticketing_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Issue_new_ticketController
{
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private ComboBox<String> busTypeComboBox;
    @FXML
    private ComboBox<String> fromComboBox;
    @FXML
    private TextField passengerNameTextField;
    @FXML
    private ComboBox<String> toComboBox;
    @FXML
    private TextField fareAmountTextField;
    @FXML
    private ComboBox<String> seatNoComboBox;
    @FXML
    private TextArea ticketDetailsTextArea;
    @FXML
    private DatePicker dateDP;

    @FXML
    public void initialize() {
        busTypeComboBox.getItems().addAll("AC", "Non-AC", "Sleeper", "Semi-Sleeper");
        fromComboBox.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Khulna");
        toComboBox.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Khulna");
        seatNoComboBox.getItems().addAll("1A", "1B", "2A", "2B", "3A", "3B");
    }

    @FXML
    public void verifyFareOnClick(ActionEvent actionEvent) {
        // temporary output example
        ticketDetailsTextArea.setText("Fare verified successfully.");
    }

    @FXML
    public void generateTicketOnClick(ActionEvent actionEvent) {
        ticketDetailsTextArea.setText("Ticket generated successfully.");
    }

    @FXML
    public void printTicketOnClick(ActionEvent actionEvent) {
        ticketDetailsTextArea.setText("Ticket printed successfully.");
    }
}

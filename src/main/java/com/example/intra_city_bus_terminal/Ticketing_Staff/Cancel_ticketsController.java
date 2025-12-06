package com.example.intra_city_bus_terminal.Ticketing_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Cancel_ticketsController
{
    @FXML
    private TextField passengerNameTextField;
    @FXML
    private TextField travelDateTextField;
    @FXML
    private TextField ticketNumberTextField;
    @FXML
    private Label outputLabel;
    @FXML
    private TextField seatNumberTextField;

    @FXML
    public void initialize() {
        // Future initialization if needed
    }

    @FXML
    public void cancelTicketOnClick(ActionEvent actionEvent) {
        outputLabel.setText("Ticket cancelled successfully.");
    }

    @FXML
    public void verifyTicketOnClick(ActionEvent actionEvent) {
        outputLabel.setText("Ticket verified successfully.");
    }
}

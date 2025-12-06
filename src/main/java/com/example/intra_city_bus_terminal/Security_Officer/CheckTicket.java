package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;

public class CheckTicket
{
    @javafx.fxml.FXML
    private Label MessageLabel;
    @javafx.fxml.FXML
    private Label PassengerNameLabel;
    @javafx.fxml.FXML
    private Label PassengerNumberLabel;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private TextField TicketIDTextField;
    @javafx.fxml.FXML
    private Label SeatNumberLabel;

    @javafx.fxml.FXML
    public void initialize() {
        TicketIDTextField.setId("TicketIDTextField");
        PassengerNameLabel.setId("PassengerNameLabel");
        PassengerNumberLabel.setId("PassengerNumberLabel");
        SeatNumberLabel.setId("SeatNumberLabel");
        MessageLabel.setId("MessageLabel");

    }

    @javafx.fxml.FXML
    public void TicketVerifyOnActionButton(ActionEvent actionEvent) {
    }

    public CheckTicket(Label messageLabel, Label passengerNameLabel, Label passengerNumberLabel, MenuBar menuBar, TextField ticketIDTextField, Label seatNumberLabel) {
        MessageLabel = messageLabel;
        PassengerNameLabel = passengerNameLabel;
        PassengerNumberLabel = passengerNumberLabel;
        MenuBar = menuBar;
        TicketIDTextField = ticketIDTextField;
        SeatNumberLabel = seatNumberLabel;
    }

    public Label getMessageLabel() {
        return MessageLabel;
    }

    public void setMessageLabel(Label messageLabel) {
        MessageLabel = messageLabel;
    }

    public Label getPassengerNumberLabel() {
        return PassengerNumberLabel;
    }

    public void setPassengerNumberLabel(Label passengerNumberLabel) {
        PassengerNumberLabel = passengerNumberLabel;
    }

    public Label getPassengerNameLabel() {
        return PassengerNameLabel;
    }

    public void setPassengerNameLabel(Label passengerNameLabel) {
        PassengerNameLabel = passengerNameLabel;
    }

    public MenuBar getMenuBar() {
        return MenuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        MenuBar = menuBar;
    }

    public TextField getTicketIDTextField() {
        return TicketIDTextField;
    }

    public void setTicketIDTextField(TextField ticketIDTextField) {
        TicketIDTextField = ticketIDTextField;
    }

    public Label getSeatNumberLabel() {
        return SeatNumberLabel;
    }

    public void setSeatNumberLabel(Label seatNumberLabel) {
        SeatNumberLabel = seatNumberLabel;
    }

    @Override
    public String toString() {
        return "CheckTicket{" +
                "MessageLabel=" + MessageLabel +
                ", PassengerNameLabel=" + PassengerNameLabel +
                ", PassengerNumberLabel=" + PassengerNumberLabel +
                ", MenuBar=" + MenuBar +
                ", TicketIDTextField=" + TicketIDTextField +
                ", SeatNumberLabel=" + SeatNumberLabel +
                '}';
    }
}
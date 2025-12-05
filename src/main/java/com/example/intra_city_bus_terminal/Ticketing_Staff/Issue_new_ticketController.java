package com.example.intra_city_bus_terminal.Ticketing_Staff;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Issue_new_ticketController
{
    @javafx.fxml.FXML
    private TextField phoneNumberTextField;
    @javafx.fxml.FXML
    private ComboBox busTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox fromComboBox;
    @javafx.fxml.FXML
    private TextField passengerNameTextField;
    @javafx.fxml.FXML
    private ComboBox toComboBox;
    @javafx.fxml.FXML
    private TextField fareAmountTextField;
    @javafx.fxml.FXML
    private ComboBox seatNoComboBox;
    @javafx.fxml.FXML
    private TextArea ticketDetailsTextArea;
    @javafx.fxml.FXML
    private DatePicker dateDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void verifyFareOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateTicketOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void printTicketOnClick(ActionEvent actionEvent) {
    }
}
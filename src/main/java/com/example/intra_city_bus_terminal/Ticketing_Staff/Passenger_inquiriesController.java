package com.example.intra_city_bus_terminal.Ticketing_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Passenger_inquiriesController
{
    @FXML
    private Label outputLabel;
    @FXML
    private TextArea replyTextArea;
    @FXML
    private TextField passengerNameTextField;
    @FXML
    private TextArea messageTextArea;
    @FXML
    private TableColumn<Passenger_inquiriesController, String> passengerNameColumn;
    @FXML
    private TableColumn<Passenger_inquiriesController, String> inquiryIdColumn;
    @FXML
    private TableColumn<Passenger_inquiriesController, String> messagePreviewColumn;

    @FXML
    public void initialize() {
        // TableColumn properties can be set in Scene Builder or here if needed
        // Example: passengerNameColumn.setCellValueFactory(new PropertyValueFactory<>("passengerName"));
    }

    @FXML
    public void sentReplyOnClick(ActionEvent actionEvent) {
        outputLabel.setText("Reply sent successfully.");
    }
}

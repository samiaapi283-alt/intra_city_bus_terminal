package com.example.intra_city_bus_terminal.Ticketing_Staff;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Passenger_inquiriesController
{
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextArea replyTextArea;
    @javafx.fxml.FXML
    private TextField passengerNameTextField;
    @javafx.fxml.FXML
    private TextArea messageTextArea;
    @javafx.fxml.FXML
    private TableColumn passengerNameColumn;
    @javafx.fxml.FXML
    private TableColumn inquiryIdColumn;
    @javafx.fxml.FXML
    private TableColumn messagePreviewColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sentReplyOnClick(ActionEvent actionEvent) {
    }
}
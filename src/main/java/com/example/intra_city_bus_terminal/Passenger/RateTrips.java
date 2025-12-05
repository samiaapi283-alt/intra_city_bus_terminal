package com.example.intra_city_bus_terminal.Passenger;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RateTrips
{
    @javafx.fxml.FXML
    private ComboBox<String> RatingCB;
    @javafx.fxml.FXML
    private TextField TickeNoTF;
    @javafx.fxml.FXML
    private TextArea FeedbackTA;
    @javafx.fxml.FXML
    private TextField BusnoTF;
    @javafx.fxml.FXML
    private DatePicker DateDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SubmitOA(ActionEvent actionEvent) {
    }
}
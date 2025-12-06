package com.example.intra_city_bus_terminal.Passenger;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FeedbackRequest
{
    @javafx.fxml.FXML
    private ComboBox<String> ComplaintTypeCB;
    @javafx.fxml.FXML
    private TextArea DescriptionTF;
    @javafx.fxml.FXML
    private TextField TrackingIDTF;

    @javafx.fxml.FXML
    public void initialize() {

        ComplaintTypeCB.getItems().addAll("Unclean", "Uncomfortable sit" , "Rude Staff");

    }

    @javafx.fxml.FXML
    public void SubmitOA(ActionEvent actionEvent) {
    }
}
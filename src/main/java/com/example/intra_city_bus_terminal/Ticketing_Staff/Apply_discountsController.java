package com.example.intra_city_bus_terminal.Ticketing_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Apply_discountsController
{
    @FXML
    private TextField busNumberTextField;
    @FXML
    private Label outputLabel;
    @FXML
    private TextField passengerNameTextField;
    @FXML
    private TextField ticketNumberTextField;
    @FXML
    private ComboBox<String> availaibleDiscountComboBox;

    @FXML
    public void initialize() {
        availaibleDiscountComboBox.getItems().addAll(
                "Student Discount",
                "Senior Citizen",
                "Festival Offer",
                "Early Bird"
        );
    }

    @FXML
    public void applyDiscountOnClick(ActionEvent actionEvent) {
        String discount = availaibleDiscountComboBox.getValue();
        outputLabel.setText("Applied: " + discount);
    }
}

package com.example.intra_city_bus_terminal.Passenger;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class BookATicket
{
    @javafx.fxml.FXML
    private TextField PassengerNameTF;
    @javafx.fxml.FXML
    private ComboBox<String> FromCB;
    @javafx.fxml.FXML
    private TextField AccountNOTF;
    @javafx.fxml.FXML
    private TextField EmailTF;
    @javafx.fxml.FXML
    private ComboBox<String> PaymentmethodCB;
    @javafx.fxml.FXML
    private TextField PhoneTF;
    @javafx.fxml.FXML
    private ComboBox<String> SelectedBusCB;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private ComboBox <String>ToCB;

    @javafx.fxml.FXML
    public void initialize() {

        SelectedBusCB.getItems().addAll("Shamoli", "Hanif" , "Ena");
        FromCB.getItems().addAll("Kushtia","Khulna","Rajsahi","Rangpur", "Dhaka");
        ToCB.getItems().addAll("Kushtia","Khulna","Rajsahi","Rangpur", "Dhaka");
        PaymentmethodCB.getItems().addAll("bKash", "Roket" , "Nagad", "Bank");

    }

    @javafx.fxml.FXML
    public void ConfirmSeatOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PaymentOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmPaymentOA(ActionEvent actionEvent) {
    }
}
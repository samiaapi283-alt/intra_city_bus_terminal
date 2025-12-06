package com.example.intra_city_bus_terminal.Station_Manager;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;

public class Assign_Staff_Duty
{
    @javafx.fxml.FXML
    private TextField LocationTextField;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void StaffMemberOACB(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ShiftTypeOACB(ActionEvent actionEvent) {
    }

    public Assign_Staff_Duty(MenuBar menuBar, TextField locationTextField, DatePicker datePicker, Label messageLabel) {
        MenuBar = menuBar;
        LocationTextField = locationTextField;
        DatePicker = datePicker;
        this.messageLabel = messageLabel;
    }

    public TextField getLocationTextField() {
        return LocationTextField;
    }

    public void setLocationTextField(TextField locationTextField) {
        LocationTextField = locationTextField;
    }

    public MenuBar getMenuBar() {
        return MenuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        MenuBar = menuBar;
    }

    public DatePicker getDatePicker() {
        return DatePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        DatePicker = datePicker;
    }

    public Label getMessageLabel() {
        return messageLabel;
    }

    public void setMessageLabel(Label messageLabel) {
        this.messageLabel = messageLabel;
    }

    @Override
    public String toString() {
        return "Assign_Staff_Duty{" +
                "LocationTextField=" + LocationTextField +
                ", MenuBar=" + MenuBar +
                ", DatePicker=" + DatePicker +
                ", messageLabel=" + messageLabel +
                '}';
    }
}
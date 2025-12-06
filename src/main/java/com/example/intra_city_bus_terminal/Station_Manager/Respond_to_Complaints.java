package com.example.intra_city_bus_terminal.Station_Manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class Respond_to_Complaints
{
    @javafx.fxml.FXML
    private Label ConfirmationLabel;
    @javafx.fxml.FXML
    private ComboBox <String> ComplaintCB;
    @javafx.fxml.FXML
    private TextField ReplyTextField;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private VBox Vbox;

    @javafx.fxml.FXML
    public void initialize() {
        ComplaintCB.getItems().addAll("Complaint1", "Complaint2",
                "Complaint3", "Complaint4", "Complaint5", "Complaint6",
                "Complaint7", "Complaint8", "Complaint9", "Complaint10", "Complaint11",
                "Complaint12", "Complaint13", "Complaint14");
        ComplaintCB.setId("ComplaintCB");
        ReplyTextField.setId("ReplyTextField");
        DatePicker.setId("DatePicker");
        Vbox.setId("Vbox");
        MenuBar.setId("MenuBar");
    }

    @javafx.fxml.FXML
    public void Complaint14OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SendResponseOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint9OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint2OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint1OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint4OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint3OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint6OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint5OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint8OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint7OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint10OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint11OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint12OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Complaint13OA(ActionEvent actionEvent) {
    }

    public Respond_to_Complaints(Label confirmationLabel, TextField replyTextField, ComboBox<String> complaintCB, MenuBar menuBar, DatePicker datePicker, VBox vbox) {
        ConfirmationLabel = confirmationLabel;
        ReplyTextField = replyTextField;
        ComplaintCB = complaintCB;
        MenuBar = menuBar;
        DatePicker = datePicker;
        Vbox = vbox;
    }

    public Label getConfirmationLabel() {
        return ConfirmationLabel;
    }

    public void setConfirmationLabel(Label confirmationLabel) {
        ConfirmationLabel = confirmationLabel;
    }

    public ComboBox<String> getComplaintCB() {
        return ComplaintCB;
    }

    public void setComplaintCB(ComboBox<String> complaintCB) {
        ComplaintCB = complaintCB;
    }

    public TextField getReplyTextField() {
        return ReplyTextField;
    }

    public void setReplyTextField(TextField replyTextField) {
        ReplyTextField = replyTextField;
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

    public VBox getVbox() {
        return Vbox;
    }

    public void setVbox(VBox vbox) {
        Vbox = vbox;
    }

    @Override
    public String toString() {
        return "Respond_to_Complaints{" +
                "ConfirmationLabel=" + ConfirmationLabel +
                ", ComplaintCB=" + ComplaintCB +
                ", ReplyTextField=" + ReplyTextField +
                ", MenuBar=" + MenuBar +
                ", DatePicker=" + DatePicker +
                ", Vbox=" + Vbox +
                '}';
    }
}
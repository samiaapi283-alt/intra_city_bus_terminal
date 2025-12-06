package com.example.intra_city_bus_terminal.Station_Manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Approve_Leave_Request
{
    @javafx.fxml.FXML
    private TextField ReasonTextField;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private DatePicker DatePicker2;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TextField StaffNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RejectRequestOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ApproveRequestOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NoOnActionCheckBox(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void YesOnActionCheckBox(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PendingLeaveRequestComboBoxOA(ActionEvent actionEvent) {
    }

    public Approve_Leave_Request(TextField reasonTextField, Label outputLabel, DatePicker datePicker2, MenuBar menuBar, DatePicker datePicker, TextField staffNameTextField) {
        ReasonTextField = reasonTextField;
        OutputLabel = outputLabel;
        DatePicker2 = datePicker2;
        MenuBar = menuBar;
        DatePicker = datePicker;
        StaffNameTextField = staffNameTextField;
    }

    public TextField getReasonTextField() {
        return ReasonTextField;
    }

    public void setReasonTextField(TextField reasonTextField) {
        ReasonTextField = reasonTextField;
    }

    public Label getOutputLabel() {
        return OutputLabel;
    }

    public void setOutputLabel(Label outputLabel) {
        OutputLabel = outputLabel;
    }

    public DatePicker getDatePicker2() {
        return DatePicker2;
    }

    public void setDatePicker2(DatePicker datePicker2) {
        DatePicker2 = datePicker2;
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

    public TextField getStaffNameTextField() {
        return StaffNameTextField;
    }

    public void setStaffNameTextField(TextField staffNameTextField) {
        StaffNameTextField = staffNameTextField;
    }

    @Override
    public String toString() {
        return "Approve_Leave_Request{" +
                "ReasonTextField=" + ReasonTextField +
                ", OutputLabel=" + OutputLabel +
                ", DatePicker2=" + DatePicker2 +
                ", MenuBar=" + MenuBar +
                ", DatePicker=" + DatePicker +
                ", StaffNameTextField=" + StaffNameTextField +
                '}';
    }
}
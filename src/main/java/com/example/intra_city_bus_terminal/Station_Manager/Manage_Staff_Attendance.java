package com.example.intra_city_bus_terminal.Station_Manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Manage_Staff_Attendance
{
    @javafx.fxml.FXML
    private MenuBar menubar;
    @javafx.fxml.FXML
    private TableColumn <Manage_Staff_Attendance, String> IDTC;
    @javafx.fxml.FXML
    private TableColumn <Manage_Staff_Attendance, String> NameTC;
    @javafx.fxml.FXML
    private TableView <Manage_Staff_Attendance> tableview;
    @javafx.fxml.FXML
    private CheckBox AttendanceCheckBox;
    @javafx.fxml.FXML
    private TextField StaffNameTextField;
    @javafx.fxml.FXML
    private DatePicker Datepicker;
    @javafx.fxml.FXML
    private TableColumn <Manage_Staff_Attendance, String> AttendanceTC;
    @javafx.fxml.FXML
    private TextField StaffIDTextfield;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void UpdateattendanceOA(ActionEvent actionEvent) {
    }

    public Manage_Staff_Attendance(MenuBar menubar, TableColumn<Manage_Staff_Attendance, String> IDTC, TableColumn<Manage_Staff_Attendance, String> nameTC, TableView<Manage_Staff_Attendance> tableview, TextField staffNameTextField, CheckBox attendanceCheckBox, DatePicker datepicker, TableColumn<Manage_Staff_Attendance, String> attendanceTC, TextField staffIDTextfield) {
        this.menubar = menubar;
        this.IDTC = IDTC;
        NameTC = nameTC;
        this.tableview = tableview;
        StaffNameTextField = staffNameTextField;
        AttendanceCheckBox = attendanceCheckBox;
        Datepicker = datepicker;
        AttendanceTC = attendanceTC;
        StaffIDTextfield = staffIDTextfield;
    }

    public MenuBar getMenubar() {
        return menubar;
    }

    public void setMenubar(MenuBar menubar) {
        this.menubar = menubar;
    }

    public TableColumn<Manage_Staff_Attendance, String> getIDTC() {
        return IDTC;
    }

    public void setIDTC(TableColumn<Manage_Staff_Attendance, String> IDTC) {
        this.IDTC = IDTC;
    }

    public TableColumn<Manage_Staff_Attendance, String> getNameTC() {
        return NameTC;
    }

    public void setNameTC(TableColumn<Manage_Staff_Attendance, String> nameTC) {
        NameTC = nameTC;
    }

    public TableView<Manage_Staff_Attendance> getTableview() {
        return tableview;
    }

    public void setTableview(TableView<Manage_Staff_Attendance> tableview) {
        this.tableview = tableview;
    }

    public CheckBox getAttendanceCheckBox() {
        return AttendanceCheckBox;
    }

    public void setAttendanceCheckBox(CheckBox attendanceCheckBox) {
        AttendanceCheckBox = attendanceCheckBox;
    }

    public TextField getStaffNameTextField() {
        return StaffNameTextField;
    }

    public void setStaffNameTextField(TextField staffNameTextField) {
        StaffNameTextField = staffNameTextField;
    }

    public DatePicker getDatepicker() {
        return Datepicker;
    }

    public void setDatepicker(DatePicker datepicker) {
        Datepicker = datepicker;
    }

    public TableColumn<Manage_Staff_Attendance, String> getAttendanceTC() {
        return AttendanceTC;
    }

    public void setAttendanceTC(TableColumn<Manage_Staff_Attendance, String> attendanceTC) {
        AttendanceTC = attendanceTC;
    }

    public TextField getStaffIDTextfield() {
        return StaffIDTextfield;
    }

    public void setStaffIDTextfield(TextField staffIDTextfield) {
        StaffIDTextfield = staffIDTextfield;
    }

    @Override
    public String toString() {
        return "Manage_Staff_Attendance{" +
                "menubar=" + menubar +
                ", IDTC=" + IDTC +
                ", NameTC=" + NameTC +
                ", tableview=" + tableview +
                ", AttendanceCheckBox=" + AttendanceCheckBox +
                ", StaffNameTextField=" + StaffNameTextField +
                ", Datepicker=" + Datepicker +
                ", AttendanceTC=" + AttendanceTC +
                ", StaffIDTextfield=" + StaffIDTextfield +
                '}';
    }
}
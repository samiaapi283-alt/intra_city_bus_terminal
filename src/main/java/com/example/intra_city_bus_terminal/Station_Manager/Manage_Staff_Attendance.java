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
}
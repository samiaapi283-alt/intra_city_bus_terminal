package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class View_SecurityStaff_List
{
    @javafx.fxml.FXML
    private TableColumn <View_SecurityStaff_List, String> StaffIDTC;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private TableView <View_SecurityStaff_List> Tableview;
    @javafx.fxml.FXML
    private TableColumn <View_SecurityStaff_List, DatePicker> DateTC;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TextField SatffIDTextField;
    @javafx.fxml.FXML
    private TextField StaffNameTextField;
    @javafx.fxml.FXML
    private TableColumn <View_SecurityStaff_List, String> AvailabilityTC;

    @javafx.fxml.FXML
    public void initialize() {


    }

    @javafx.fxml.FXML
    public void SearchOnAction(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
    }

    public View_SecurityStaff_List(TableColumn<View_SecurityStaff_List, String> staffIDTC, MenuBar menuBar, TableView<View_SecurityStaff_List> tableview, TableColumn<View_SecurityStaff_List, DatePicker> dateTC, TextField satffIDTextField, DatePicker datePicker, TextField staffNameTextField, TableColumn<View_SecurityStaff_List, String> availabilityTC) {
        StaffIDTC = staffIDTC;
        MenuBar = menuBar;
        Tableview = tableview;
        DateTC = dateTC;
        SatffIDTextField = satffIDTextField;
        DatePicker = datePicker;
        StaffNameTextField = staffNameTextField;
        AvailabilityTC = availabilityTC;
    }

    public TableColumn<View_SecurityStaff_List, String> getStaffIDTC() {
        return StaffIDTC;
    }

    public void setStaffIDTC(TableColumn<View_SecurityStaff_List, String> staffIDTC) {
        StaffIDTC = staffIDTC;
    }

    public MenuBar getMenuBar() {
        return MenuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        MenuBar = menuBar;
    }

    public TableView<View_SecurityStaff_List> getTableview() {
        return Tableview;
    }

    public void setTableview(TableView<View_SecurityStaff_List> tableview) {
        Tableview = tableview;
    }

    public TableColumn<View_SecurityStaff_List, DatePicker> getDateTC() {
        return DateTC;
    }

    public void setDateTC(TableColumn<View_SecurityStaff_List, DatePicker> dateTC) {
        DateTC = dateTC;
    }

    public DatePicker getDatePicker() {
        return DatePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        DatePicker = datePicker;
    }

    public TextField getSatffIDTextField() {
        return SatffIDTextField;
    }

    public void setSatffIDTextField(TextField satffIDTextField) {
        SatffIDTextField = satffIDTextField;
    }

    public TextField getStaffNameTextField() {
        return StaffNameTextField;
    }

    public void setStaffNameTextField(TextField staffNameTextField) {
        StaffNameTextField = staffNameTextField;
    }

    public TableColumn<View_SecurityStaff_List, String> getAvailabilityTC() {
        return AvailabilityTC;
    }

    public void setAvailabilityTC(TableColumn<View_SecurityStaff_List, String> availabilityTC) {
        AvailabilityTC = availabilityTC;
    }

    @Override
    public String toString() {
        return "View_SecurityStaff_List{" +
                "StaffIDTC=" + StaffIDTC +
                ", MenuBar=" + MenuBar +
                ", Tableview=" + Tableview +
                ", DateTC=" + DateTC +
                ", DatePicker=" + DatePicker +
                ", SatffIDTextField=" + SatffIDTextField +
                ", StaffNameTextField=" + StaffNameTextField +
                ", AvailabilityTC=" + AvailabilityTC +
                '}';
    }
}
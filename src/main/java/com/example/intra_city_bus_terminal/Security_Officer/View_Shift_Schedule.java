package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class View_Shift_Schedule
{
    @javafx.fxml.FXML
    private TableColumn <View_Shift_Schedule, String> OfficerIDTC;
    @javafx.fxml.FXML
    private TableColumn <View_Shift_Schedule, String> DutyLocationTC;
    @javafx.fxml.FXML
    private TableColumn <View_Shift_Schedule, String> DutyTimeTC;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TableView <View_Shift_Schedule> TableView;

    @javafx.fxml.FXML
    public void initialize() {



    }

    @javafx.fxml.FXML
    public void SearchOnAction(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();

    }

    public View_Shift_Schedule(TableColumn<View_Shift_Schedule, String> officerIDTC, TableColumn<View_Shift_Schedule, String> dutyLocationTC, TableColumn<View_Shift_Schedule, String> dutyTimeTC, MenuBar menuBar, DatePicker datePicker, TableView<View_Shift_Schedule> tableView) {
        OfficerIDTC = officerIDTC;
        DutyLocationTC = dutyLocationTC;
        DutyTimeTC = dutyTimeTC;
        MenuBar = menuBar;
        DatePicker = datePicker;
        TableView = tableView;
    }

    public TableColumn<View_Shift_Schedule, String> getOfficerIDTC() {
        return OfficerIDTC;
    }

    public void setOfficerIDTC(TableColumn<View_Shift_Schedule, String> officerIDTC) {
        OfficerIDTC = officerIDTC;
    }

    public TableColumn<View_Shift_Schedule, String> getDutyLocationTC() {
        return DutyLocationTC;
    }

    public void setDutyLocationTC(TableColumn<View_Shift_Schedule, String> dutyLocationTC) {
        DutyLocationTC = dutyLocationTC;
    }

    public MenuBar getMenuBar() {
        return MenuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        MenuBar = menuBar;
    }

    public TableColumn<View_Shift_Schedule, String> getDutyTimeTC() {
        return DutyTimeTC;
    }

    public void setDutyTimeTC(TableColumn<View_Shift_Schedule, String> dutyTimeTC) {
        DutyTimeTC = dutyTimeTC;
    }

    public DatePicker getDatePicker() {
        return DatePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        DatePicker = datePicker;
    }

    public TableView<View_Shift_Schedule> getTableView() {
        return TableView;
    }

    public void setTableView(TableView<View_Shift_Schedule> tableView) {
        TableView = tableView;
    }

    @Override
    public String toString() {
        return "View_Shift_Schedule{" +
                "OfficerIDTC=" + OfficerIDTC +
                ", DutyLocationTC=" + DutyLocationTC +
                ", DutyTimeTC=" + DutyTimeTC +
                ", MenuBar=" + MenuBar +
                ", DatePicker=" + DatePicker +
                ", TableView=" + TableView +
                '}';
    }
}
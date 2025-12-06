package com.example.intra_city_bus_terminal.Station_Manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Manage_LostandFound
{
    @javafx.fxml.FXML
    private TextField ItemIDTF;
    @javafx.fxml.FXML
    private TableColumn <Manage_LostandFound, String> LocationFoundTC;
    @javafx.fxml.FXML
    private ComboBox <String> StatusCB;
    @javafx.fxml.FXML
    private TableColumn <Manage_LostandFound, String> DateFoundTC;
    @javafx.fxml.FXML
    private TextField SearchItemTextField;
    @javafx.fxml.FXML
    private TableColumn <Manage_LostandFound, String> FinderTC;
    @javafx.fxml.FXML
    private TableColumn <Manage_LostandFound, String> StatusTC;
    @javafx.fxml.FXML
    private TableColumn <Manage_LostandFound, String> ItemIDTC;
    @javafx.fxml.FXML
    private TableColumn <Manage_LostandFound, String> NameTC;
    @javafx.fxml.FXML
    private DatePicker DatePicker;
    @javafx.fxml.FXML
    private TextField ItemNameTextField;
    @javafx.fxml.FXML
    private TextField FinderTF;
    @javafx.fxml.FXML
    private TableView <Manage_LostandFound> TableView;
    @javafx.fxml.FXML
    private TextField LocationTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ClearOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SearchOA(ActionEvent actionEvent) {
    }

    public Manage_LostandFound(TextField itemIDTF, TableColumn<Manage_LostandFound, String> locationFoundTC, ComboBox<String> statusCB, TableColumn<Manage_LostandFound, String> dateFoundTC, TextField searchItemTextField, TableColumn<Manage_LostandFound, String> finderTC, TableColumn<Manage_LostandFound, String> statusTC, TableColumn<Manage_LostandFound, String> itemIDTC, TableColumn<Manage_LostandFound, String> nameTC, DatePicker datePicker, TextField itemNameTextField, TextField finderTF, TableView<Manage_LostandFound> tableView, TextField locationTF) {
        ItemIDTF = itemIDTF;
        LocationFoundTC = locationFoundTC;
        StatusCB = statusCB;
        DateFoundTC = dateFoundTC;
        SearchItemTextField = searchItemTextField;
        FinderTC = finderTC;
        StatusTC = statusTC;
        ItemIDTC = itemIDTC;
        NameTC = nameTC;
        DatePicker = datePicker;
        ItemNameTextField = itemNameTextField;
        FinderTF = finderTF;
        TableView = tableView;
        LocationTF = locationTF;
    }

    public TextField getItemIDTF() {
        return ItemIDTF;
    }

    public void setItemIDTF(TextField itemIDTF) {
        ItemIDTF = itemIDTF;
    }

    public TableColumn<Manage_LostandFound, String> getLocationFoundTC() {
        return LocationFoundTC;
    }

    public void setLocationFoundTC(TableColumn<Manage_LostandFound, String> locationFoundTC) {
        LocationFoundTC = locationFoundTC;
    }

    public ComboBox<String> getStatusCB() {
        return StatusCB;
    }

    public void setStatusCB(ComboBox<String> statusCB) {
        StatusCB = statusCB;
    }

    public TableColumn<Manage_LostandFound, String> getDateFoundTC() {
        return DateFoundTC;
    }

    public void setDateFoundTC(TableColumn<Manage_LostandFound, String> dateFoundTC) {
        DateFoundTC = dateFoundTC;
    }

    public TextField getSearchItemTextField() {
        return SearchItemTextField;
    }

    public void setSearchItemTextField(TextField searchItemTextField) {
        SearchItemTextField = searchItemTextField;
    }

    public TableColumn<Manage_LostandFound, String> getFinderTC() {
        return FinderTC;
    }

    public void setFinderTC(TableColumn<Manage_LostandFound, String> finderTC) {
        FinderTC = finderTC;
    }

    public TableColumn<Manage_LostandFound, String> getStatusTC() {
        return StatusTC;
    }

    public void setStatusTC(TableColumn<Manage_LostandFound, String> statusTC) {
        StatusTC = statusTC;
    }

    public TableColumn<Manage_LostandFound, String> getItemIDTC() {
        return ItemIDTC;
    }

    public void setItemIDTC(TableColumn<Manage_LostandFound, String> itemIDTC) {
        ItemIDTC = itemIDTC;
    }

    public TableColumn<Manage_LostandFound, String> getNameTC() {
        return NameTC;
    }

    public void setNameTC(TableColumn<Manage_LostandFound, String> nameTC) {
        NameTC = nameTC;
    }

    public TextField getItemNameTextField() {
        return ItemNameTextField;
    }

    public void setItemNameTextField(TextField itemNameTextField) {
        ItemNameTextField = itemNameTextField;
    }

    public DatePicker getDatePicker() {
        return DatePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        DatePicker = datePicker;
    }

    public TextField getFinderTF() {
        return FinderTF;
    }

    public TableView<Manage_LostandFound> getTableView() {
        return TableView;
    }

    public void setTableView(TableView<Manage_LostandFound> tableView) {
        TableView = tableView;
    }

    public TextField getLocationTF() {
        return LocationTF;
    }

    public void setLocationTF(TextField locationTF) {
        LocationTF = locationTF;
    }

    public void setFinderTF(TextField finderTF) {
        FinderTF = finderTF;

    }

    @Override
    public String toString() {
        return "Manage_LostandFound{" +
                "ItemIDTF=" + ItemIDTF +
                ", LocationFoundTC=" + LocationFoundTC +
                ", StatusCB=" + StatusCB +
                ", DateFoundTC=" + DateFoundTC +
                ", SearchItemTextField=" + SearchItemTextField +
                ", FinderTC=" + FinderTC +
                ", StatusTC=" + StatusTC +
                ", ItemIDTC=" + ItemIDTC +
                ", NameTC=" + NameTC +
                ", DatePicker=" + DatePicker +
                ", ItemNameTextField=" + ItemNameTextField +
                ", FinderTF=" + FinderTF +
                ", TableView=" + TableView +
                ", LocationTF=" + LocationTF +
                '}';
    }
}
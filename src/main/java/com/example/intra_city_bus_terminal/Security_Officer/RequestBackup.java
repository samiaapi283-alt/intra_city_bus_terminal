package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class RequestBackup
{
    @javafx.fxml.FXML
    private ComboBox <String> LocationComboBox;
    @javafx.fxml.FXML
    private TextField ReasonTextField;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TableColumn <RequestBackup, String> StatusTC;
    @javafx.fxml.FXML
    private TableColumn <RequestBackup, String> ReasonTC;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private TableView <RequestBackup> BackupTableView;
    @javafx.fxml.FXML
    private TableColumn <RequestBackup, String> LocationTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SendBackupRequestOnAction(ActionEvent actionEvent) {
    }

    public RequestBackup(ComboBox<String> locationComboBox, TextField reasonTextField, Label outputLabel, TableColumn<RequestBackup, String> statusTC, TableColumn<RequestBackup, String> reasonTC, MenuBar menuBar, TableView<RequestBackup> backupTableView, TableColumn<RequestBackup, String> locationTC) {
        LocationComboBox = locationComboBox;
        ReasonTextField = reasonTextField;
        OutputLabel = outputLabel;
        StatusTC = statusTC;
        ReasonTC = reasonTC;
        MenuBar = menuBar;
        BackupTableView = backupTableView;
        LocationTC = locationTC;
    }

    public ComboBox<String> getLocationComboBox() {
        return LocationComboBox;
    }

    public void setLocationComboBox(ComboBox<String> locationComboBox) {
        LocationComboBox = locationComboBox;
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

    public TableColumn<RequestBackup, String> getStatusTC() {
        return StatusTC;
    }

    public void setStatusTC(TableColumn<RequestBackup, String> statusTC) {
        StatusTC = statusTC;
    }

    public TableColumn<RequestBackup, String> getReasonTC() {
        return ReasonTC;
    }

    public void setReasonTC(TableColumn<RequestBackup, String> reasonTC) {
        ReasonTC = reasonTC;
    }

    public MenuBar getMenuBar() {
        return MenuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        MenuBar = menuBar;
    }

    public TableView<RequestBackup> getBackupTableView() {
        return BackupTableView;
    }

    public void setBackupTableView(TableView<RequestBackup> backupTableView) {
        BackupTableView = backupTableView;
    }

    public TableColumn<RequestBackup, String> getLocationTC() {
        return LocationTC;
    }

    public void setLocationTC(TableColumn<RequestBackup, String> locationTC) {
        LocationTC = locationTC;
    }

    @Override
    public String toString() {
        return "RequestBackup{" +
                "LocationComboBox=" + LocationComboBox +
                ", ReasonTextField=" + ReasonTextField +
                ", OutputLabel=" + OutputLabel +
                ", StatusTC=" + StatusTC +
                ", ReasonTC=" + ReasonTC +
                ", MenuBar=" + MenuBar +
                ", BackupTableView=" + BackupTableView +
                ", LocationTC=" + LocationTC +
                '}';
    }
}
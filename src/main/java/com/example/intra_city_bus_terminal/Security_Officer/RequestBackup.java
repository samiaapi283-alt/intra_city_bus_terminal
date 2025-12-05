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
}
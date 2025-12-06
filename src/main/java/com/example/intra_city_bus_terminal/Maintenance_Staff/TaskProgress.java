package com.example.intra_city_bus_terminal.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

public class TaskProgress
{
    @javafx.fxml.FXML
    private DatePicker Date_DP;
    @javafx.fxml.FXML
    private ComboBox <String> StatusCB;
    @javafx.fxml.FXML
    private TextArea ProgressNotesTA;
    @javafx.fxml.FXML
    private ComboBox<String> SelectTaskCB;

    @javafx.fxml.FXML
    public void initialize() {

        StatusCB.getItems().addAll("Finish","Start later","importent");
        SelectTaskCB.getItems().addAll("Cleaning","Chack ticket ","Inspection");
    }

    @javafx.fxml.FXML
    public void CompleteOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AddAlertOA(ActionEvent actionEvent) {
    }
}
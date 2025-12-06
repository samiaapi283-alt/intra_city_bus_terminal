package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Generate_Security_Alert
{
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TextField NoteTextField;
    @javafx.fxml.FXML
    private ComboBox <String> AlertTypeComboBox;



    @javafx.fxml.FXML
    public void initialize() {
        OutputLabel = new Label();
        NoteTextField = new TextField();
        AlertTypeComboBox = new ComboBox<>();

        AlertTypeComboBox.getItems().addAll("Fire Alert", "Medical Alert", "Bomb threat", "Misiing child alert", "Evacuation Alert");
    }

    @javafx.fxml.FXML
    public void SendAlertOnAction(ActionEvent actionEvent) {
    }

    public Generate_Security_Alert(TextField noteTextField, Label outputLabel, ComboBox<String> alertTypeComboBox) {
        NoteTextField = noteTextField;
        OutputLabel = outputLabel;
        AlertTypeComboBox = alertTypeComboBox;
    }

    public Label getOutputLabel() {
        return OutputLabel;
    }

    public void setOutputLabel(Label outputLabel) {
        OutputLabel = outputLabel;
    }

    public TextField getNoteTextField() {
        return NoteTextField;
    }

    public void setNoteTextField(TextField noteTextField) {
        NoteTextField = noteTextField;
    }

    public ComboBox<String> getAlertTypeComboBox() {
        return AlertTypeComboBox;
    }

    public void setAlertTypeComboBox(ComboBox<String> alertTypeComboBox) {
        AlertTypeComboBox = alertTypeComboBox;
    }

    @Override
    public String toString() {
        return "Generate_Security_Alert{" +
                "OutputLabel=" + OutputLabel +
                ", NoteTextField=" + NoteTextField +
                ", AlertTypeComboBox=" + AlertTypeComboBox +
                '}';
    }
}


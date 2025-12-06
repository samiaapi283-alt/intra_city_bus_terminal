package com.example.intra_city_bus_terminal;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login
{
    @javafx.fxml.FXML
    private TextField UsernameTextfield;
    @javafx.fxml.FXML
    private PasswordField PasswordField;
    @javafx.fxml.FXML
    private ComboBox <String> UserTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {

        if (UserTypeComboBox.getItems().isEmpty()) {
            UserTypeComboBox.getItems().addAll("Security Officer", "Station Manager", "Maintenance Staff", "Ticketing Staff", "Passenger");
        }

    }



    @javafx.fxml.FXML
    public void LoginOnAction(ActionEvent actionEvent) {
        String username = UsernameTextfield.getText();
        String password = PasswordField.getText();
        String type = UserTypeComboBox.getValue();
    }


    @javafx.fxml.FXML
    public void CreateAnAccountOnAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void UsertypeComboBoxOnAction(ActionEvent actionEvent) {
    }

    private void showAlert(Alert.AlertType type, String message) {
        Alert alert = new Alert(type);
        alert.setContentText(message);
        alert.setContentText(message);
        alert.showAndWait();

    }



}
package com.example.intra_city_bus_terminal;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public abstract class LoginTab extends Application {

    @FXML
    Button CreateAnAccountOnAction;

    public void CreateAnAccount() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));

        Stage window = (Stage) CreateAnAccountOnAction.getScene().getWindow();
        window.setScene(new Scene(root));

    }
}

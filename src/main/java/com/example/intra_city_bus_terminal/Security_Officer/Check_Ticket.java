package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

class Check_Ticket extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(Check_Ticket.class.getResource("Check_Ticket.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Ticket Verification");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package com.example.intra_city_bus_terminal.Bus_Driver;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;

public class Passenger_List
{
    @FXML
    private TableColumn<Passenger_List, String> ticketIdColumn;
    @FXML
    private TableColumn<Passenger_List, String> passengerNameColumn;
    @FXML
    private TableColumn<Passenger_List, String> seatNumberColumn;
    @FXML
    private ComboBox<String> tripListComboBox;

    @FXML
    public void initialize() {
        tripListComboBox.getItems().addAll(
                "Trip-101",
                "Trip-102",
                "Trip-103",
                "Trip-104"
        );

        ticketIdColumn.setText("Ticket ID");
        passengerNameColumn.setText("Passenger Name");
        seatNumberColumn.setText("Seat Number");
    }
}

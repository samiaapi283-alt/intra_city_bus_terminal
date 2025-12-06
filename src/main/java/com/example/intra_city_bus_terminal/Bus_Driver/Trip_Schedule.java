package com.example.intra_city_bus_terminal.Bus_Driver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class Trip_Schedule
{
    @FXML
    private TableColumn<Trip_Schedule, String> tripIdColumn;
    @FXML
    private TableColumn<Trip_Schedule, String> departureTimeColumn;
    @FXML
    private TableColumn<Trip_Schedule, String> routeColumn;
    @FXML
    private TableColumn<Trip_Schedule, String> busNumberColumn;
    @FXML
    private TableColumn<Trip_Schedule, String> dateColumn;

    @FXML
    public void initialize() {
        tripIdColumn.setText("Trip ID");
        departureTimeColumn.setText("Departure Time");
        routeColumn.setText("Route");
        busNumberColumn.setText("Bus Number");
        dateColumn.setText("Date");
    }

    @FXML
    public void viewFullScheduleOnClick(ActionEvent actionEvent) {
    }
}

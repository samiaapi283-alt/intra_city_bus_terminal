package com.example.intra_city_bus_terminal.Passenger;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class RefundTicket
{
    @javafx.fxml.FXML
    private TextField TicketIDTF;
    @javafx.fxml.FXML
    private TextField RouteTF;
    @javafx.fxml.FXML
    private TableColumn<RefundTicket,String> SeatnoTC;
    @javafx.fxml.FXML
    private TableColumn<RefundTicket,String> RouteTC;
    @javafx.fxml.FXML
    private TableColumn<RefundTicket, LocalDate> DateTC;
    @javafx.fxml.FXML
    private TextField SeatnoTF;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private TableColumn <RefundTicket,Integer>TicketIDTC;

    @javafx.fxml.FXML
    public void initialize() {


        SeatnoTC.setCellValueFactory(new PropertyValueFactory<>("CardNo"));
        RouteTC.setCellValueFactory(new PropertyValueFactory<>("HolderName"));
        DateTC.setCellValueFactory(new PropertyValueFactory<>("GateWayName"));


    }

    @javafx.fxml.FXML
    public void ConfirmRefundOA(ActionEvent actionEvent) {
    }
}
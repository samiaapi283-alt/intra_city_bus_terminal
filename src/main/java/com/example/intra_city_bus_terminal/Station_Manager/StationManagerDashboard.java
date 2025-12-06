package com.example.intra_city_bus_terminal.Station_Manager;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;

import javax.swing.text.html.ImageView;

public class StationManagerDashboard
{
    @javafx.fxml.FXML
    private Label DashboardLabel;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private ImageView Image1;
    @javafx.fxml.FXML
    private VBox Vbox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void CleaningScheduleOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PlatformAllocationsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LostandFoundOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LeaveRequestOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AssignDutyOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SignoutOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void MonitorOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ComplaintOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void StaffAttendanceOnAction(ActionEvent actionEvent) {
    }

    public StationManagerDashboard(Label dashboardLabel, MenuBar menuBar, ImageView image1, VBox vbox) {
        DashboardLabel = dashboardLabel;
        MenuBar = menuBar;
        Image1 = image1;
        Vbox = vbox;
    }

    public Label getDashboardLabel() {
        return DashboardLabel;
    }

    public void setDashboardLabel(Label dashboardLabel) {
        DashboardLabel = dashboardLabel;
    }

    public MenuBar getMenuBar() {
        return MenuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        MenuBar = menuBar;
    }

    public ImageView getImage1() {
        return Image1;
    }

    public void setImage1(ImageView image1) {
        Image1 = image1;
    }

    public VBox getVbox() {
        return Vbox;
    }

    public void setVbox(VBox vbox) {
        Vbox = vbox;
    }

    @Override
    public String toString() {
        return "StationManagerDashboard{" +
                "DashboardLabel=" + DashboardLabel +
                ", MenuBar=" + MenuBar +
                ", Image1=" + Image1 +
                ", Vbox=" + Vbox +
                '}';
    }
}
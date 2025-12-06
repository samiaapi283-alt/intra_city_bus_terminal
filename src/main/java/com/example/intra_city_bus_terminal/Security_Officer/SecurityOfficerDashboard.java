package com.example.intra_city_bus_terminal.Security_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;

import javax.swing.text.html.ImageView;

public class SecurityOfficerDashboard
{
    @javafx.fxml.FXML
    private Label DashboardLabel;
    @javafx.fxml.FXML
    private MenuBar MenuBar;
    @javafx.fxml.FXML
    private VBox VboxSM;
    @javafx.fxml.FXML
    private ImageView SecurityImage;
    @javafx.fxml.FXML
    private Button RequestBackupButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SecurityAlertOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ShiftScheduleOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RequestBackupOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void StaffListOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CCTVOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SignOutOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RestrictedAreaOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SecurityIncidentOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CheckTicketOnAction(ActionEvent actionEvent) {
    }

    public SecurityOfficerDashboard(Label dashboardLabel, MenuBar menuBar, VBox vboxSM, Button requestBackupButton, ImageView securityImage) {
        DashboardLabel = dashboardLabel;
        MenuBar = menuBar;
        VboxSM = vboxSM;
        RequestBackupButton = requestBackupButton;
        SecurityImage = securityImage;
    }

    public Label getDashboardLabel() {
        return DashboardLabel;
    }

    public void setDashboardLabel(Label dashboardLabel) {
        DashboardLabel = dashboardLabel;
    }

    public VBox getVboxSM() {
        return VboxSM;
    }

    public void setVboxSM(VBox vboxSM) {
        VboxSM = vboxSM;
    }

    public MenuBar getMenuBar() {
        return MenuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        MenuBar = menuBar;
    }

    public ImageView getSecurityImage() {
        return SecurityImage;
    }

    public void setSecurityImage(ImageView securityImage) {
        SecurityImage = securityImage;
    }

    public Button getRequestBackupButton() {
        return RequestBackupButton;
    }

    public void setRequestBackupButton(Button requestBackupButton) {
        RequestBackupButton = requestBackupButton;
    }

    @Override
    public String toString() {
        return "SecurityOfficerDashboard{" +
                "DashboardLabel=" + DashboardLabel +
                ", MenuBar=" + MenuBar +
                ", VboxSM=" + VboxSM +
                ", SecurityImage=" + SecurityImage +
                ", RequestBackupButton=" + RequestBackupButton +
                '}';
    }
}
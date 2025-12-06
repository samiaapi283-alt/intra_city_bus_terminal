package com.example.intra_city_bus_terminal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.Random;

public class CreateAnAccount
{
    @FXML
    private Label UserIDLabel;
    @FXML
    private TextField NumberTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private PasswordField Passwordfield;
    @FXML
    private Button LoginButton;
    @FXML
    private TextField EmailTextField;
    @FXML
    private ComboBox  <String> usertypeComboBox;



    ArrayList<String> userTypeList = new ArrayList<>();
    @FXML
    public void initialize() {
        usertypeComboBox.getItems().addAll("Security Officer", "Station Manager", "Bus Driver", "Maintenance Staff", "Ticketing Staff", "Passenger");
        UserIDLabel.setText(Integer.toString(this.generateID()));

    }

    @FXML
    public void usertypeComboBoxOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void signUpButonOnAction(ActionEvent actionEvent) {
        String  UserID, UserName, UserType, UserEmail, UserPhoneNumber, Password;
        int ID;

        ID = Integer.parseInt(UserIDLabel.getText());
        UserName = nameTextField.getText();
        UserType = usertypeComboBox.getValue();
        UserEmail = EmailTextField.getText();
        UserPhoneNumber = NumberTextField.getText();
        Password = Passwordfield.getText();

        boolean flag = true;
        if (UserName.isBlank())  {
            flag = false;
        }
        if (UserType.isBlank())  {
            flag = false;
        }
        if (UserEmail.isBlank())  {
            flag = false;
        }
        if (UserPhoneNumber.isBlank())  {
            flag = false;
        }
        if (Password.length() < 6)  {
            flag = false;
        }

        if (flag) {
            CreateAnAccount createAnAccount = new CreateAnAccount();
            ArrayList<String> userTypeList = createAnAccount.userTypeList;
        }

    }

    @FXML
    public void LoginButtonOnAction(ActionEvent actionEvent) {
        String UserName;
        String UserType;
        String Password;

        int ID;
        ID = Integer.parseInt(UserIDLabel.getText());
        UserName = nameTextField.getText();
        UserType = usertypeComboBox.getValue();
        Password = Passwordfield.getText();

        boolean flag = true;
        if (Password.length() < 6)  {
            flag = false;
        }

    }

    private int generateID() {
        int ID = 0;
        Random random = new Random();
        ID += random.nextInt(10000000, 99999999);

        return ID;
    }

}


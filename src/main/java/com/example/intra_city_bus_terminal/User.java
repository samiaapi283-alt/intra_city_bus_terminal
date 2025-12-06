package com.example.intra_city_bus_terminal;

import java.util.Objects;

public class User {
    private String UserID, UserName, UserType, UserEmail, UserPhoneNumber, Password;


    public User(String userID, String userName, String userType, String userEmail, String userPhoneNumber, String password) {
        UserID = userID;
        UserName = userName;
        UserType = userType;
        UserEmail = userEmail;
        UserPhoneNumber = userPhoneNumber;
        Password = password;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        UserPhoneNumber = userPhoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID='" + UserID + '\'' +
                ", UserName='" + UserName + '\'' +
                ", UserType='" + UserType + '\'' +
                ", UserEmail='" + UserEmail + '\'' +
                ", UserPhoneNumber='" + UserPhoneNumber + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }


    public boolean Login(String UserName, String UserType, String Password) {
        return Objects.equals(this.UserName, UserName) && Objects.equals(this.UserType, UserType) && Objects.equals(this.Password, Password);
    }

    public boolean resetPassword(String OldPassword, String NewPassword) {
        if (Objects.equals(this.getPassword(), OldPassword)) {
            this.setPassword(NewPassword);
            return true;
        }
        return false;
    }


}

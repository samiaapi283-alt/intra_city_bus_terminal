package com.example.intra_city_bus_terminal.Passenger;

import java.time.LocalDate;

public class BookATicketM {
    private String SelectedBus, From,PassengerName,Paymentmethod, To, Email;
    private int Phone,AccountNO;
    private LocalDate Date;

    public BookATicketM(String selectedBus, String from, String passengerName, String paymentmethod, String to, String email, int phone, int accountNO, LocalDate date) {
        SelectedBus = selectedBus;
        From = from;
        PassengerName = passengerName;
        Paymentmethod = paymentmethod;
        To = to;
        Email = email;
        Phone = phone;
        AccountNO = accountNO;
        Date = date;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public int getAccountNO() {
        return AccountNO;
    }

    public void setAccountNO(int accountNO) {
        AccountNO = accountNO;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getPaymentmethod() {
        return Paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        Paymentmethod = paymentmethod;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerName(String passengerName) {
        PassengerName = passengerName;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getSelectedBus() {
        return SelectedBus;
    }

    public void setSelectedBus(String selectedBus) {
        SelectedBus = selectedBus;
    }

    @Override
    public String toString() {
        return "BookATicketM{" +
                "SelectedBus='" + SelectedBus + '\'' +
                ", From='" + From + '\'' +
                ", PassengerName='" + PassengerName + '\'' +
                ", Paymentmethod='" + Paymentmethod + '\'' +
                ", To='" + To + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone=" + Phone +
                ", AccountNO=" + AccountNO +
                ", Date=" + Date +
                '}';
    }
}

package com.example.intra_city_bus_terminal.Passenger;

import java.time.LocalDate;

public class RateTripsM {
    private String Busno, TickeNo, Rating, Feedback;
    private LocalDate Date;

    public RateTripsM(String busno, String tickeNo, String rating, String feedback, LocalDate date) {
        Busno = busno;
        TickeNo = tickeNo;
        Rating = rating;
        Feedback = feedback;
        Date = date;
    }

    public String getBusno() {
        return Busno;
    }

    public void setBusno(String busno) {
        Busno = busno;
    }

    public String getTickeNo() {
        return TickeNo;
    }

    public void setTickeNo(String tickeNo) {
        TickeNo = tickeNo;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "RateTripsM{" +
                "Busno='" + Busno + '\'' +
                ", TickeNo='" + TickeNo + '\'' +
                ", Rating='" + Rating + '\'' +
                ", Feedback='" + Feedback + '\'' +
                ", Date=" + Date +
                '}';
    }
}

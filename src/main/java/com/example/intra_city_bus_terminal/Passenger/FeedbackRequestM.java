package com.example.intra_city_bus_terminal.Passenger;

public class FeedbackRequestM {
    private String ComplaintType,Description,TrackingID;

    public FeedbackRequestM(String complaintType, String description, String trackingID) {
        ComplaintType = complaintType;
        Description = description;
        TrackingID = trackingID;
    }

    public String getComplaintType() {
        return ComplaintType;
    }

    public void setComplaintType(String complaintType) {
        ComplaintType = complaintType;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTrackingID() {
        return TrackingID;
    }

    public void setTrackingID(String trackingID) {
        TrackingID = trackingID;
    }

    @Override
    public String toString() {
        return "FeedbackRequestM{" +
                "ComplaintType='" + ComplaintType + '\'' +
                ", Description='" + Description + '\'' +
                ", TrackingID='" + TrackingID + '\'' +
                '}';
    }
}

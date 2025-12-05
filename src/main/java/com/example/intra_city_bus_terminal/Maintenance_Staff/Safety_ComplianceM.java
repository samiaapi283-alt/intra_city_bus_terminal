package com.example.intra_city_bus_terminal.Maintenance_Staff;

public class Safety_ComplianceM {
    private String Location, ComplianceNotes;
    private int IssueID;

    public Safety_ComplianceM(String location, String complianceNotes, int issueID) {
        Location = location;
        ComplianceNotes = complianceNotes;
        IssueID = issueID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getComplianceNotes() {
        return ComplianceNotes;
    }

    public void setComplianceNotes(String complianceNotes) {
        ComplianceNotes = complianceNotes;
    }

    public int getIssueID() {
        return IssueID;
    }

    public void setIssueID(int issueID) {
        IssueID = issueID;
    }

    @Override
    public String toString() {
        return "Safety_ComplianceM{" +
                "Location='" + Location + '\'' +
                ", ComplianceNotes='" + ComplianceNotes + '\'' +
                ", IssueID=" + IssueID +
                '}';
    }
}

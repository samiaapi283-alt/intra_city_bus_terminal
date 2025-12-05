package com.example.intra_city_bus_terminal.Maintenance_Staff;

import java.time.LocalDate;

public class Report_New_IssuesM {
    private String IssueLocation, Issue, Description ;
    private LocalDate IssueDate;

    public Report_New_IssuesM(String issueLocation, String issue, String description, LocalDate issueDate) {
        IssueLocation = issueLocation;
        Issue = issue;
        Description = description;
        IssueDate = issueDate;
    }

    public String getIssueLocation() {
        return IssueLocation;
    }

    public void setIssueLocation(String issueLocation) {
        IssueLocation = issueLocation;
    }

    public String getIssue() {
        return Issue;
    }

    public void setIssue(String issue) {
        Issue = issue;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDate getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        IssueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Report_New_IssuesM{" +
                "IssueLocation='" + IssueLocation + '\'' +
                ", Issue='" + Issue + '\'' +
                ", Description='" + Description + '\'' +
                ", IssueDate=" + IssueDate +
                '}';
    }
}

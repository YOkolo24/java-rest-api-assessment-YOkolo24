package com.cbfacademy.apiassessment.tasks;

import java.time.Instant;

public class Tasks {

    private long id;
    private String taskDetails;
    private boolean isCompleted;
    private Instant date;
    
    public Tasks(long id, String taskDetails, boolean isCompleted, Instant dateTime) {

        this.id = id;
        this.taskDetails = taskDetails;
        this.isCompleted = isCompleted;
        this.date = dateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

}

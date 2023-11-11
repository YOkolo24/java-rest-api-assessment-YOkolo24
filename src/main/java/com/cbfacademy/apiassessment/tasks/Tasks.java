package com.cbfacademy.apiassessment.tasks;

public class Tasks {

    private Integer id;
    private String taskDetails;
    private boolean isCompleted;
    
    public Tasks(Integer id, String taskDetails, boolean isCompleted) {

        this.id = id;
        this.taskDetails = taskDetails;
        this.isCompleted = isCompleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}

package com.cbfacademy.apiassessment.tasks;

public class Tasks {

    private Integer id;
    private String taskDetails;
    private boolean isCompleted;
    private Integer priorityScoreOutOfFive;
    
    public Tasks(Integer id, String taskDetails, Integer priorityScoreOutOfFive, boolean isCompleted) {

        this.id = id;
        this.taskDetails = taskDetails;
        this.priorityScoreOutOfFive = priorityScoreOutOfFive;
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
    public Integer getPriorityScoreOutOfFive() {
        return priorityScoreOutOfFive;
    }

    public void setPriorityScoreOutOfFive(Integer priorityScoreOutOfFive) {
        this.priorityScoreOutOfFive = priorityScoreOutOfFive;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
 
}

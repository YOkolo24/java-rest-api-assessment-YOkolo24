package com.cbfacademy.apiassessment.service;

public class ResponsesModel {
    
    private String status = Responses.fail;
    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}

package com.service.student.model.dto;

public class Response {

    private int responseCode;
    private String responseDescription;

    public Response(int responseCode, String responseDescription) {
        this.responseCode = responseCode;
        this.responseDescription = responseDescription;
    }

    public Response(){}

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }
}

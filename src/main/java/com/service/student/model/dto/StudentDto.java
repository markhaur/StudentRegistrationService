package com.service.student.model.dto;

import com.service.student.model.data.Student;

public class StudentDto {

    private Student student;
    private Response response;

    public StudentDto(Student student, Response response) {
        this.student = student;
        this.response = response;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}

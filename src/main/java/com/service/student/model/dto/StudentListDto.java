package com.service.student.model.dto;

import com.service.student.model.data.Student;

import java.util.List;

public class StudentListDto {

    private List<Student> studentList;
    private Response response;

    public StudentListDto(List<Student> studentList, Response response) {
        this.studentList = studentList;
        this.response = response;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}

package com.service.student.controller;

import com.service.student.model.data.Student;
import com.service.student.model.dto.LoginRequest;
import com.service.student.model.dto.Response;
import com.service.student.model.dto.StudentDto;
import com.service.student.model.dto.StudentListDto;
import com.service.student.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public StudentListDto getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/student/{studentId}", method = RequestMethod.GET)
    public StudentDto getStudent(@PathVariable("studentId") Integer id){
        return studentService.getStudentById(id);
    }

    @RequestMapping(value = "/student/validate/{emailId}", method = RequestMethod.GET)
    public Response validateRegisteredStudent(@PathVariable("emailId") String email){
        return studentService.validateStudent(email);
    }

    @RequestMapping(value = "/student/add", method = RequestMethod.POST)
    public Response saveStudent(Student student){
        return studentService.saveStudent(student);
    }

    @RequestMapping(value = "/student/login", method = RequestMethod.POST)
    public Response studentLogin(LoginRequest loginRequest){
        return studentService.login(loginRequest);
    }
}

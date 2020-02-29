package com.service.student.service;

import com.service.student.model.data.Student;
import com.service.student.model.dto.LoginRequest;
import com.service.student.model.dto.Response;
import com.service.student.model.dto.StudentDto;
import com.service.student.model.dto.StudentListDto;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    StudentListDto getAllStudents();

    StudentDto getStudentById(Integer id);

    Response saveStudent(Student student);

    Response login(LoginRequest loginRequest);

    Response validateStudent(String emailId);
}

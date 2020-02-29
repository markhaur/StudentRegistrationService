package com.service.student.service;

import com.service.student.model.data.Student;
import com.service.student.model.dto.LoginRequest;
import com.service.student.model.dto.Response;
import com.service.student.model.dto.StudentDto;
import com.service.student.model.dto.StudentListDto;
import com.service.student.repository.StudentRepository;
import com.service.student.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentListDto getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        return new StudentListDto(studentList, new Response(ResponseUtils.SUCCESS_CODE, ResponseUtils.SUCCESS_DESC));
    }

    @Override
    public StudentDto getStudentById(Integer id) {
        Student student = studentRepository.findStudentById(id);
        return new StudentDto(student, new Response(ResponseUtils.SUCCESS_CODE, ResponseUtils.SUCCESS_DESC));
    }

    @Override
    public Response saveStudent(Student student) {
        studentRepository.save(student);
        return new Response(ResponseUtils.SUCCESS_CODE, ResponseUtils.SUCCESS_DESC);
    }

    @Override
    public Response login(LoginRequest loginRequest) {
        if(loginRequest.getEmail() == null || loginRequest.getEmail().isEmpty()
                || loginRequest.getPassword() == null || loginRequest.getPassword().isEmpty()){
            return new Response(ResponseUtils.ERROR_CODE, ResponseUtils.INVALID_REQUEST);
        }
        Student student = studentRepository.findStudentByEmail(loginRequest.getEmail());
        if(student != null){
            if(student.getEmail().equals(loginRequest.getEmail()) &&
                    student.getPassword().equals(loginRequest.getPassword())){
                return new Response(ResponseUtils.SUCCESS_CODE, ResponseUtils.SUCCESS_DESC);
            }
        }
        return new Response(ResponseUtils.ERROR_CODE, ResponseUtils.LOGIN_FAILURE);
    }

    @Override
    public Response validateStudent(String emailId) {
        Student student = studentRepository.findStudentByEmail(emailId);
        if(student != null)
            return new Response(ResponseUtils.SUCCESS_CODE, ResponseUtils.SUCCESS_DESC);
        return new Response(ResponseUtils.ERROR_CODE, ResponseUtils.VALIDATION_FAILED);
    }


}

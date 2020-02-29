package com.service.student.repository;

import com.service.student.model.data.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student save(Student student);

    List<Student> findAll();

    Student findStudentById(Integer id);

    Student findStudentByEmail(String email);
}

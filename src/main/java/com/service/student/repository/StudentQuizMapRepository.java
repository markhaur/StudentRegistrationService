package com.service.student.repository;

import com.service.student.model.data.StudentQuizMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentQuizMapRepository extends JpaRepository<StudentQuizMap, Integer> {

    StudentQuizMap save(StudentQuizMap studentQuizMap);

}

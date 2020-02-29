package com.service.student.model.data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "student_quiz_map")
public class StudentQuizMap {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "quiz_id")
    private Integer quizId;

    @Column(name = "created_date")
    private Timestamp createdDate;

    public StudentQuizMap(Integer id, Integer studentId, Integer quizId, Timestamp createdDate) {
        this.id = id;
        this.studentId = studentId;
        this.quizId = quizId;
        this.createdDate = createdDate;
    }

    public StudentQuizMap(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getQuizId() {
        return quizId;
    }

    public void setQuizId(Integer quizId) {
        this.quizId = quizId;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
}

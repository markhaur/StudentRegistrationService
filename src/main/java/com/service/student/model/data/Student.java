package com.service.student.model.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_num")
    private String phoneNum;

    @Column(name = "email")
    private String email;

    @Column(name = "cnic")
    private String cnic;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "password")
    private String password;

    @OneToMany
    @JoinColumn(name = "id")
    private List<StudentQuizMap> studentQuizMaps;

    public Student(Integer id, String name, String phoneNum,
                   String email, String cnic, String fatherName,
                   String address, String city, Timestamp createdDate, List<StudentQuizMap> studentQuizMaps,
                   String password) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.cnic = cnic;
        this.fatherName = fatherName;
        this.address = address;
        this.city = city;
        this.createdDate = createdDate;
        this.studentQuizMaps = studentQuizMaps;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<StudentQuizMap> getStudentQuizMaps() {
        return studentQuizMaps;
    }

    public void setStudentQuizMaps(List<StudentQuizMap> studentQuizMaps) {
        this.studentQuizMaps = studentQuizMaps;
    }

    public Student(){}

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

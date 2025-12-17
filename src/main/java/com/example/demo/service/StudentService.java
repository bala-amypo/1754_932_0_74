package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import java.util.*;

public interface StudentService {

    public StudentEntity addStudents(StudentEntity student);
    public List<StudentEntity> getStudents();
    public StudentEntity getStudentById(long id);

}
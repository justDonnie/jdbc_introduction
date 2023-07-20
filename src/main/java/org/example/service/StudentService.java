package org.example.service;

import org.example.model.Student;

import java.util.List;

public interface StudentService {
    //crud
    void createTableStudent();
    void saveStudent(Student student);
    List<Student> getAllStudents();
    void updateStudent(Long id, Student student);
    void cleanTable();
    void dropTable();
}

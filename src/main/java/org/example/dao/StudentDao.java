package org.example.dao;

import org.example.model.Student;

import java.util.List;

public interface StudentDao {
    //crud
    void createTableStudent();
    void saveStudent(Student student);
    List<Student>getAllStudents();
    void updateStudent(Long id, Student student);
    void cleanTable();
    void dropTable();
}

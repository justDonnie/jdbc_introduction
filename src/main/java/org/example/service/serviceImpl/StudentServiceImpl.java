package org.example.service.serviceImpl;

import org.example.dao.StudentDao;
import org.example.dao.daoImpl.StudentDaoImpl;
import org.example.model.Student;
import org.example.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDao studentDao = new StudentDaoImpl();
    @Override
    public void createTableStudent() {
       studentDao.createTableStudent();
    }

    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
       return studentDao.getAllStudents();
    }

    @Override
    public void updateStudent(Long id, Student student) {
        studentDao.updateStudent(id,student);
    }

    @Override
    public void cleanTable() {
        studentDao.cleanTable();
    }

    @Override
    public void dropTable() {
        studentDao.dropTable();
    }
}

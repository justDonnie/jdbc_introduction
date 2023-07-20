package org.example;

import org.example.config.service.Config;
import org.example.model.Student;
import org.example.service.StudentService;
import org.example.service.serviceImpl.StudentServiceImpl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentService studentService = new StudentServiceImpl();
        System.out.print("Enter a command!: ");
       int a = 0;
        while (a<22) {
            int k = new Scanner(System.in).nextInt();
            switch (k){
                case 1 ->studentService.createTableStudent();
                case 2 ->studentService.saveStudent(new Student("Sam","Anders",17));
                case 3 ->studentService.getAllStudents().forEach(System.out::println);
                case 4 -> studentService.updateStudent(4L,new Student("Pablo","Gavi",20));
                case 5 -> studentService.cleanTable();
                case 6 -> studentService.dropTable();
            }
        }
    }
}

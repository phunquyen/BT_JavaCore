package com.xtel.training.student_management.manager;

import com.xtel.training.student_management.entities.Student;
import com.xtel.training.student_management.model.StudentDao;

import java.sql.*;
import java.util.*;

public class StudentManager {
    private static Scanner sc = new Scanner(System.in);

    public void add() throws SQLException {
        //input student
        //
        int numberOfStudents = 0;
        System.out.print("Enter number of students: ");
        numberOfStudents = Integer.parseInt(sc.nextLine());
        //
        List<Student> stdStudentList = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            Student std = input();
            stdStudentList.add(std);
        }
        // insert student into db
        for (Student student : stdStudentList) {
            try {
                StudentDao.insert(student);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
//        logger.info("Insert data successful.!");
    }
    public Student input() throws SQLException {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        if(StudentDao.isExistedName(name)){
            System.out.println("Name is Existed !!");
        };
        System.out.print("Enter old: ");
        int old = Integer.parseInt(sc.nextLine());
        System.out.print("Enter address birth: ");
        String address_birth = sc.nextLine();
        System.out.print("Enter gender (nam - 1, nu - 0): ");
        int gender = Integer.parseInt(sc.nextLine());
        System.out.println("");
        return new Student(name, old, address_birth, gender);
    }
}
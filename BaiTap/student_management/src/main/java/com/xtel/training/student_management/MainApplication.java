package com.xtel.training.student_management;

import com.xtel.training.student_management.manager.StudentManager;
import com.xtel.training.student_management.model.ConnectionFactory;
import com.xtel.training.student_management.model.StudentDao;

import java.sql.SQLException;

public class MainApplication {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory.init();

        StudentManager studentManager = new StudentManager();
        studentManager.add();
    }
}

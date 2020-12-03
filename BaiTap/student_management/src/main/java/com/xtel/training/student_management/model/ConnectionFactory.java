package com.xtel.training.student_management.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static String URL;
    private static String USER_NAME;
    private static String PASSWORD;
    public static final String FILE_CONFIG = "./config/db.txt";

    public static void init() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(FILE_CONFIG));
            String line = "";
            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    String[] arr = line.split("\\=");
                    switch (arr[0].trim()) {
                        case "URL":
                            if (arr.length > 1) {
                                URL = arr[1].trim();
                            } else {
                                URL = "";
                            }
                            System.out.println("URL: " + URL);
                            break;
                        case "USER_NAME":
                            if (arr.length > 1) {
                                USER_NAME = arr[1].trim();
                            } else {
                                USER_NAME = "";
                            }
                            System.out.println("USER_NAME: " + USER_NAME);
                            break;
                        case "PASSWORD":
                            if (arr.length > 1) {
                                PASSWORD = arr[1].trim();
                            } else {
                                PASSWORD = "";
                            }
                            System.out.println("PASSWORD: " + PASSWORD);
                            break;
                    }
                }

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }
}


package org.example.config.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class Config {
    private final static   String url="jdbc:postgresql://localhost:5432/postgres4";
    private final static String userName="postgres";
    private final static String password="postgres";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
           // System.out.println("Connected to database...");
        }catch ( Exception e){
            System.out.println(e.getMessage());
        }
        return connection;
    }



}

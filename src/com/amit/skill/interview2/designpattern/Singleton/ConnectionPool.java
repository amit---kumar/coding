package com.amit.skill.interview2.designpattern.Singleton;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by amitkumar on 28/5/18.
 */
public enum ConnectionPool {
    INSTANCE;

    public Connection conn;

    private ConnectionPool() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
        }catch(Exception e){

        }
    }

    public static ConnectionPool getInstance() {
        return INSTANCE;
    }
}


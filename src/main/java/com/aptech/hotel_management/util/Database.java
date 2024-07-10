package com.aptech.hotel_management.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/";
    private static final String DB_NAME = "";
    private static final String USER = "";
    private static final String PASS = "";

    private Database() {

    }

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(DB_URL + DB_NAME, USER, PASS);
        } catch (SQLException e) {
            // TODO: handle exception
            throw new SQLException("Failed to connect to the database", e);
        }
    }

}

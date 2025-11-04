package ua.com.kisit.unit10.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDb {

    Connection connection = null;

    public Connection getConnection(String url, String username, String password) {

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("No connection to database!");
            throw new RuntimeException(e);
        }

        return connection;

    }





}

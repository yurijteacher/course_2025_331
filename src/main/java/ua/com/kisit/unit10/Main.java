package ua.com.kisit.unit10;

import ua.com.kisit.unit10.config.ConnectionToDb;

public class Main {

    public static void main(String[] args) {

        ConnectionToDb connectionToDb = new ConnectionToDb();

        connectionToDb.getConnection("jdbc:mysql://localhost:3306/test_331_2025", "root", "root1234");


    }

}

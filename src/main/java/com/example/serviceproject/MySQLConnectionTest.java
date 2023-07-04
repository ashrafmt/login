package com.example.serviceproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionTest {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/newnew";
        String username = "root";
        String password = "";

        // Attempt to establish the connection
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create the connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Connection successful
            System.out.println("Connection to MySQL database established!");

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the MySQL database!");
            e.printStackTrace();
        }
    }
}

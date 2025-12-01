package com.pluralsight;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    // TODO: Enter username and password
    private static final String DB_SERVER = "skills4it.database.windows.net";
    private static final String DB_NAME = "BilalTheGoat";
    private static final String DB_USER = "User65";
    private static final String DB_PASS = "CelebratingMaryJanes27Birthday";

    public static void main(String[] args) {
        String connectionUrl = String.format(
                "jdbc:sqlserver://%s:1433;"
                        + "database=%s;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;",
                DB_SERVER,
                DB_NAME
        );

        String sql = "SELECT FullName, IsSuspect FROM AcademyCrime.People;";

        try (Connection conn = DriverManager.getConnection(connectionUrl, DB_USER, DB_PASS);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet resultSet = stmt.executeQuery()) {

            System.out.println("Connected! Showing People:\n");

            // --- Simplified result reading ---
            while (resultSet.next()) {

                String fullName = resultSet.getString("FullName");
                boolean isSuspect = resultSet.getBoolean("IsSuspect");

                System.out.printf("Name: %-20s\n", fullName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
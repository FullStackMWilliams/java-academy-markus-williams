package com.pluralsight;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    // TODO: Enter username and password
    private static final String DB_SERVER = "skills4it.database.windows.net";
    private static final String DB_NAME   = "BilalTheGoat";
    private static final String DB_USER   = "User65";
    private static final String DB_PASS   = "CelebratingMaryJanes27Birthday";

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

        String sql = "SELECT * FROM AcademyCrime.People;";

        try (
                Connection conn = DriverManager.getConnection(connectionUrl, DB_USER, DB_PASS);
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {
            System.out.println("✅ Connected to Azure SQL: " + DB_SERVER + " / " + DB_NAME);
            printResultSetAsTable(rs);
        } catch (SQLException e) {
            System.err.println("❌ Error connecting or querying Azure SQL");
            e.printStackTrace();
        }
    }

    /**
     * Print any ResultSet as an ASCII table in the console.
     * This implementation reads all rows into memory first and calculates column widths.
     */
    private static void printResultSetAsTable(ResultSet rs) throws SQLException {
        ResultSetMetaData meta = rs.getMetaData();
        int columnCount = meta.getColumnCount();

        // 1. Read all rows into memory and compute max column widths
        List<String[]> rows = new ArrayList<>();
        int[] colWidths = new int[columnCount];

        // Initialize widths with column label lengths
        for (int i = 1; i <= columnCount; i++) {
            String label = meta.getColumnLabel(i);
            colWidths[i - 1] = label.length();
        }

        // Read data rows
        while (rs.next()) {
            String[] row = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                String value = rs.getString(i);
                if (value == null) {
                    value = "NULL";
                }
                row[i - 1] = value;
                colWidths[i - 1] = Math.max(colWidths[i - 1], value.length());
            }
            rows.add(row);
        }

        // 2. Print header separator
        printSeparator(colWidths);

        // 3. Print column headers
        System.out.print("|");
        for (int i = 1; i <= columnCount; i++) {
            String colName = meta.getColumnLabel(i);
            System.out.print(" " + padRight(colName, colWidths[i - 1]) + " |");
        }
        System.out.println();

        // 4. Print another separator
        printSeparator(colWidths);

        // 5. Print all rows
        for (String[] row : rows) {
            System.out.print("|");
            for (int i = 0; i < columnCount; i++) {
                System.out.print(" " + padRight(row[i], colWidths[i]) + " |");
            }
            System.out.println();
        }

        // 6. Final separator
        printSeparator(colWidths);
    }

    private static void printSeparator(int[] colWidths) {
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        for (int width : colWidths) {
            sb.append("-".repeat(width + 2)).append("+");
        }
        System.out.println(sb);
    }

    private static String padRight(String text, int length) {
        if (text.length() >= length) return text;
        return text + " ".repeat(length - text.length());
    }
}
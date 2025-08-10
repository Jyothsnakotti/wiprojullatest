package com.wipro.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    // Update these constants to match your DB
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String JDBC_USER = "your_username";
    private static final String JDBC_PASS = "your_password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // (Optional for newer JDBC versions: Class.forName("com.mysql.cj.jdbc.Driver"); )
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM Employee";
            rs = stmt.executeQuery(sql);

            System.out.println("ID\tName\tAge\tSalary");
            while (rs.next()) {
                int id = rs.getInt("id"); // replace by actual column name
                String name = rs.getString("name");
                int age = rs.getInt("age");
                int salary = rs.getInt("salary");
                System.out.println(id + "\t" + name + "\t" + age + "\t" + salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources in reverse-order of creation
            try { if (rs != null) rs.close(); } catch (Exception e) { /* ignored */ }
            try { if (stmt != null) stmt.close(); } catch (Exception e) { /* ignored */ }
            try { if (conn != null) conn.close(); } catch (Exception e) { /* ignored */ }
        }
    }
}
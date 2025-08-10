package com.wipro.jdbcdemo;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class EmployeeInsert {

	    public static void main(String[] args) {
	        // Database connection details – change according to your setup
	        String jdbcURL = "jdbc:mysql://localhost:3306/employee_db";
	        String username = "root";
	        String password = "Jyo@4537";

	        // SQL insert statement with placeholders for parameters
	        String sqlInsert = "INSERT INTO employee (emp_name, department) VALUES (?, ?)";

	        // Sample employee data to insert
	        String empName = "John Doe";
	        String department = "Sales";

	        try (
	            // 1. Establish a connection to the DB
	            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

	            // 2. Prepare the SQL statement to prevent SQL injection
	            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
	        ) {
	            // Set the values in the prepared statement
	            preparedStatement.setString(1, empName);
	            preparedStatement.setString(2, department);

	            // Execute the insert operation
	            int rowsInserted = preparedStatement.executeUpdate();

	            if (rowsInserted > 0) {
	                System.out.println("A new employee was inserted successfully!");
	            } else {
	                System.out.println("Insert failed.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


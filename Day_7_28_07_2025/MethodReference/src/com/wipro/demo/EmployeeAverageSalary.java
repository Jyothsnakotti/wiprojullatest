package com.wipro.demo;

import java.util.Arrays;
import java.util.List;

public class EmployeeAverageSalary {
	
	public static void main(String[] args) {
        List<Employee> e = Arrays.asList(
            new Employee("John", 25, 40000),
            new Employee("Alice", 35, 60000),
            new Employee("Bob", 40, 70000),
            new Employee("Charlie", 20, 30000),
            new Employee("David", 38, 55000)
        );

        double averageSalary = e.stream()
            .filter(emp -> emp.getAge() > 30 && emp.getSalary() > 50000)
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        System.out.println("Average Salary: " + averageSalary);
    }
}

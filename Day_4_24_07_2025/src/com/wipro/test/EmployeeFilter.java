package com.wipro.test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.wipro.collections.Employee_3;

public class EmployeeFilter {
	public static void main(String[] args) {
        List<Employee_3> employees = new CopyOnWriteArrayList<>();

        employees.add(new Employee_3(101, "chaitu", 75000));
        employees.add(new Employee_3(102, "siri", 85000));
        employees.add(new Employee_3(103, "Mani", 80000));
        employees.add(new Employee_3(104, "Ram", 90000));

       
        for (Employee_3 emp : employees) {
            if (emp.salary > 80000) {
                employees.remove(emp);
            }
        }

        System.out.println("Employees earning 80000 or less is :");
        for (Employee_3 emp : employees) {
            System.out.println(emp);
        }
    }
}

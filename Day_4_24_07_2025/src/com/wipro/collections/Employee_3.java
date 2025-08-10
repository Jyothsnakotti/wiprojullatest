package com.wipro.collections;

public class Employee_3 {
	int id;
    String name;
     public double salary;

    public Employee_3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }

}

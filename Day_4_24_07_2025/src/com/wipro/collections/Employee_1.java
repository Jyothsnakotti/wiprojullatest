package com.wipro.collections;

public class Employee_1 {
	
	public class Employee {
	    private String empId;
	    private String empName;
	    private int empAge;
	    private double empSalary;

	    public Employee(String empId, String empName, int empAge, double empSalary) {
	        this.empId = empId;
	        this.empName = empName;
	        this.empAge = empAge;
	        this.empSalary = empSalary;
	    }

	    public String getEmpId() { 
	    	return empId; 
	    	}
	    public String getEmpName() { 
	    	return empName; }
	    public int getEmpAge() { 
	    	return empAge; }
	    public double getEmpSalary() {
	    	return empSalary; }

	    @Override
	    public String toString() {
	        return empId + " " + empName + " " + empAge + " " + empSalary;
	    }
	}
}

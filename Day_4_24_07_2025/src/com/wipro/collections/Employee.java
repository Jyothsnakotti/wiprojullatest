package com.wipro.collections;

public class Employee implements Comparable<Employee> {
	
	String empId;
	String empName;
	int empAge;
	double empSalary;
	
	
	public Employee(String empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public Employee(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getEmpSalary()<o.getEmpSalary())
		{
			return 1;
		}
		else if(this.getEmpSalary()>o.getEmpSalary())
		{
			return -1;
		}
		return 0;
	}

	
	

}

package com.wipro.springdemo;

public class College {
    private String collegeName;
    private Department department;

    // Constructor-based DI
    public College(String collegeName, Department department) {
        this.collegeName = collegeName;
        this.department = department;
    }

    // Getters (setters can be removed/not used for DI)
    public String getCollegeName() { return collegeName; }
    public Department getDepartment() { return department; }

    @Override
    public String toString() {
        return "College [collegeName=" + collegeName + ", department=" + department + "]";
    }
}
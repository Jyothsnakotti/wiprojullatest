package com.wipro.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
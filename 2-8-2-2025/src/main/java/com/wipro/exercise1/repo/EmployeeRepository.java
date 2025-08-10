package com.wipro.exercise1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.exercise1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

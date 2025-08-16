package com.wipro.employee.service;

import java.util.List;

import com.wipro.employee.entity.Employee;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee update(Long id, Employee employee);
    List<Employee> findAll();
    Employee findById(Long id);
    void delete(Long id);
}
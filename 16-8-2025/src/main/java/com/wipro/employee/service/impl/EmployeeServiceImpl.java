package com.wipro.employee.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.employee.entity.Address;
import com.wipro.employee.entity.Department;
import com.wipro.employee.entity.Employee;
import com.wipro.employee.repository.AddressRepository;
import com.wipro.employee.repository.DepartmentRepository;
import com.wipro.employee.repository.EmployeeRepository;
import com.wipro.employee.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final AddressRepository addressRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository,
                               AddressRepository addressRepository,
                               DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.addressRepository = addressRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Employee save(Employee employee) {
        // Reuse existing department by name if present; else cascade will create new
        Department dept = employee.getDepartment();
        if (dept != null && dept.getDeptName() != null) {
            Department existing = departmentRepository.findByDeptName(dept.getDeptName()).orElse(null);
            if (existing != null) {
                employee.setDepartment(existing);
            }
        }
        return employeeRepository.save(employee); // Cascade saves Address & Department
    }

    @Override
    public Employee update(Long id, Employee incoming) {
        Employee e = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found: " + id));

        e.setName(incoming.getName());
        e.setType(incoming.getType());
        e.setSalary(incoming.getSalary());

        // Update/replace address
        Address inAddr = incoming.getAddress();
        if (inAddr != null) {
            Address addr = e.getAddress() != null ? e.getAddress() : new Address();
            addr.setStreet(inAddr.getStreet());
            addr.setCity(inAddr.getCity());
            addr.setState(inAddr.getState());
            addr.setZipCode(inAddr.getZipCode());
            e.setAddress(addr);
        }

        // Attach department (reuse existing by name if possible)
        Department inDept = incoming.getDepartment();
        if (inDept != null) {
            Department attach = inDept;
            if (inDept.getDeptName() != null) {
                attach = departmentRepository.findByDeptName(inDept.getDeptName())
                        .orElse(inDept);
            }
            e.setDepartment(attach);
        }

        return employeeRepository.save(e);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Employee findById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found: " + id));
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
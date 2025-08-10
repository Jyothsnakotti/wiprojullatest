package com.wipro.exercise1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.exercise1.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}

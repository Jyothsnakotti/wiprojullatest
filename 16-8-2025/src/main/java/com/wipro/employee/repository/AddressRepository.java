package com.wipro.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.employee.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {}
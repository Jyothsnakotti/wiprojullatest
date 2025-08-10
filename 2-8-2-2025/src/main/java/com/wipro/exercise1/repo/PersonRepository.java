package com.wipro.exercise1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.exercise1.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}

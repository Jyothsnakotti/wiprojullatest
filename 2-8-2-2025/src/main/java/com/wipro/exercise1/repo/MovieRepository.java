package com.wipro.exercise1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.exercise1.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}

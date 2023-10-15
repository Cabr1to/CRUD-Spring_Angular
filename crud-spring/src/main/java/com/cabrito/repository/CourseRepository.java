package com.cabrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabrito.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{


    
}

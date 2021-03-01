package com.mlg.learningSpring.data.repository;

import com.mlg.learningSpring.data.entity.Course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, String> {

}

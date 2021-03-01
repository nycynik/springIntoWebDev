package com.mlg.learningSpring.data.repository;

import com.mlg.learningSpring.data.entity.CourseMember;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMemberRepository extends CrudRepository<CourseMember, String> {

}

package com.mlg.learningSpring.data.repository;

import java.util.Optional;
import java.util.UUID;

import com.mlg.learningSpring.data.entity.Member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<Member, String> {

}

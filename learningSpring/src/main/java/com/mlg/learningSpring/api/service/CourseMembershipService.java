package com.mlg.learningSpring.api.service;

import java.util.List;

import com.mlg.learningSpring.api.domain.CourseMembership;
import com.mlg.learningSpring.data.entity.Course;
import com.mlg.learningSpring.data.entity.CourseMember;
import com.mlg.learningSpring.data.entity.Member;
import com.mlg.learningSpring.data.repository.CourseMemberRepository;
import com.mlg.learningSpring.data.repository.CourseRepository;
import com.mlg.learningSpring.data.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseMembershipService {

    private final CourseRepository courseRepository;
    private final MemberRepository memberRepository;
    private final CourseMemberRepository courseMemberRepository;

    @Autowired
    private CourseMembershipService(CourseRepository courserepository, MemberRepository memberRepository,
            CourseMemberRepository courseMemberRepository) {
        this.courseRepository = courserepository;
        this.memberRepository = memberRepository;
        this.courseMemberRepository = courseMemberRepository;
    }

    private CourseMembership joinCourse(String joinCode, String memberId) {

        // fetch the course by joincode, if it is not found, we can't join, so return
        // null
        Course course = this.courseRepository.findByCourseCode(joinCode);
        if (course == null) {
            return null;
        }

        // try to fetch the member by memberId
        Member member = this.memberRepository.findById(memberId).get();
        if (member == null) {
            return null;
        }

        // check if the member is already in the course.
        // CourseMembership cm = this.courseMemberRepository.find
        // TODO: Add check for existing record!

        // we have the course and the mber, let's try to join it.
        CourseMembership courseMembership = new CourseMembership();
        courseMembership.setCourseId(course.getCourseId());
        courseMembership.setMemberId(memberId); // member.getMemberId());

        return courseMembership;
    }
}

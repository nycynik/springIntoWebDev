package com.mlg.learningSpring.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE_MEMBER")
public class CourseMember {

    @Id
    @Column(name = "COURSE_MEMBERSHIP_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String courseMembershipId;

    @Column(name = "COURSE_ID")
    private String courseId;

    @Column(name = "MEMBER_ID")
    private String memberId;

    @Column(name = "JOIN_DATE")
    private Date joinDate;

    public String getCourseMembershipId() {
        return courseMembershipId;
    }

    public void setCourseMembershipId(String courseMembershipId) {
        this.courseMembershipId = courseMembershipId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

}

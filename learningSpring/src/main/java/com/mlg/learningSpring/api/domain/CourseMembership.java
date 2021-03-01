package com.mlg.learningSpring.api.domain;

import java.util.Date;

// ==========================================
// Course Membership DTO
//
// Allows users to join courses
// ==========================================
public class CourseMembership {

    private String CourseId;
    private String CourseCode;
    private String MemberId;
    private Date date;

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String courseId) {
        CourseId = courseId;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String userId) {
        MemberId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

}

package com.mlg.learningSpring.api.domain;

import java.util.Date;

// ==========================================
// Join Course DTO
//
// Allows users to join courses
// ==========================================
public class JoinCourse {

    private String CourseId;
    private String CourseCode;
    private String UserId;
    private Date date;

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String courseId) {
        CourseId = courseId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

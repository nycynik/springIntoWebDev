DROP TABLE IF EXISTS MEMBER;
DROP TABLE IF EXISTS COURSE;
DROP TABLE IF EXISTS COURSE_MEMEBER;

CREATE TABLE MEMBER (
    MEMBER_ID VARCHAR(36) PRIMARY KEY,
    MEMBER_NAME VARCHAR(128),
    MEMBER_ROLE VARCHAR(256)
);

CREATE TABLE COURSE (
    COURSE_ID VARCHAR(36) PRIMARY KEY,
    COURSE_NAME VARCHAR(256)
);

CREATE TABLE COURSE_MEMEBER (
    COURSE_ID VARCHAR(36),
    MEMBER_ID VARCHAR(36)
);


INSERT INTO MEMBER (MEMBER_ID, MEMBER_NAME, MEMBER_ROLE) VALUES ('ABC-1', 'Mike', 'S');
INSERT INTO MEMBER (MEMBER_ID, MEMBER_NAME, MEMBER_ROLE) VALUES ('ABC-2', 'Rey', 'S');
INSERT INTO MEMBER (MEMBER_ID, MEMBER_NAME, MEMBER_ROLE) VALUES ('ABC-3', 'Anakin', 'T');
INSERT INTO MEMBER (MEMBER_ID, MEMBER_NAME, MEMBER_ROLE) VALUES ('ABC-4', 'Luke', 'S');
INSERT INTO COURSE (COURSE_ID, COURSE_NAME) VALUES ('DEF-1', 'republic');
INSERT INTO COURSE (COURSE_ID, COURSE_NAME) VALUES ('DEF-2', 'alliance');
INSERT INTO COURSE_MEMEBER (COURSE_ID, MEMBER_ID) VALUES ('DEF-1', 'ABC-4');
INSERT INTO COURSE_MEMEBER (COURSE_ID, MEMBER_ID) VALUES ('DEF-1', 'ABC-3');
INSERT INTO COURSE_MEMEBER (COURSE_ID, MEMBER_ID) VALUES ('DEF-1', 'ABC-2');
INSERT INTO COURSE_MEMEBER (COURSE_ID, MEMBER_ID) VALUES ('DEF-2', 'ABC-1');



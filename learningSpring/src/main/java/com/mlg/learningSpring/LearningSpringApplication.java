package com.mlg.learningSpring;

import com.mlg.learningSpring.data.entity.Course;
import com.mlg.learningSpring.data.entity.Member;
import com.mlg.learningSpring.data.repository.CourseRepository;
import com.mlg.learningSpring.data.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

	// Not great for production, just testing it out.
	@RestController
	@RequestMapping("/members")
	public class MemberController {

		@Autowired
		private MemberRepository memberRepository;

		@GetMapping
		public Iterable<Member> getMembers() {
			return this.memberRepository.findAll();
		}
	}

	@RestController
	@RequestMapping("/courses")
	public class CourseController {

		@Autowired
		private CourseRepository courseRepository;

		@GetMapping
		public Iterable<Course> getMembers() {
			return this.courseRepository.findAll();
		}
	}
}

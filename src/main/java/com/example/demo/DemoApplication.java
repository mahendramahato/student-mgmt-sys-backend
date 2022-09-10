package com.example.demo;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.model.User;
import com.example.demo.repository.CourseMaterialRepository;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private CourseMaterialRepository courseMaterialRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student = new Student();
//		student.setFirstName("John");
//		student.setLastName("Doe");
//		student.setGender("Male");
//		student.setDob("10/20/1992");
//		student.setG_name("James Doe");
//		student.setG_email("james@gmail.com");
//		student.setAddress("200 Oak Ridge Apts");
//		student.setEmail("john@yahoo.com");
//		student.setPhoneNumber("997-889-6780");
//		studentRepository.save(student);
//		List<Student> students = studentRepository.findByGender("Male");
//		System.out.println(students);
//		printStudentByFirstName();

//		User user = new User();
//		user.setFirstName("ram");
//		user.setLastName("shah");
//		user.setEmail("ram@gmail.com");
//		user.setPassword("1234");
//		userRepository.save(user);

	}


}

package com.example.demo.repository;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void printStudentByFirstName() {
        List<Student> students = studentRepository.findByFirstName("John");
        System.out.println("student"+students);
    }

//    @Test
//    public void saveStudent(){
//
//        Course course = Course.builder()
//                .title("Math")
//                .credits(4)
//                .build();
//
//        Course course1 = Course.builder()
//                .title("Economics")
//                .credits(3)
//                .build();
//
//        Course course2 = Course.builder()
//                .title("Physics")
//                .credits(3)
//                .build();
//
//        Student student =
//                Student.builder()
//                        .firstName("Taylor")
//                        .lastName("Swift")
//                        .gender("Female")
//                        .dob("07/29/1995")
//                        .address("987 Left St")
//                        .email("taylor@yahoo.com")
//                        .phoneNumber("009-987-2321")
//                        .g_name("Ben Swift")
//                        .g_email("ben@gmail.com")
//                        .courses(List.of(course, course1, course2))
//                        .build();
//
//        studentRepository.save(student);
//    }

}
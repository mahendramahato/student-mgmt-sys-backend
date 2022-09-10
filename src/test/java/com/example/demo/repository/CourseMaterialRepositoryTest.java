package com.example.demo.repository;

import com.example.demo.model.Course;
import com.example.demo.model.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void SaveCourseMaterial(){
        Course course = Course.builder()
                .title("English")
                .credits(3)
                .build();

        CourseMaterial courseMaterial =
                CourseMaterial.builder()
                        .url("www.google.com")
                        .course(course)
                        .build();

        courseMaterialRepository.save(courseMaterial);
    }

    public void printAllCourseMaterials(){
        List<CourseMaterial> courseMaterial =
                courseMaterialRepository.findAll();
        System.out.println("coursematrials " + courseMaterial);
    }
}
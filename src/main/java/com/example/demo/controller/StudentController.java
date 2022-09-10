package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    // build create student REST API
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    // build get student by ID REST API
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable long id){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student does not exist with this id:"+ id));
        return ResponseEntity.ok(student);
    }

    // build get student by firstName REST API
    @GetMapping("FirstName/{firstName}")
    public ResponseEntity<List<Student>> getStudentByFirstName(@PathVariable String firstName){
        List<Student> std = studentRepository.findByFirstName(firstName);
        return ResponseEntity.ok(std);
    }

    // implement update student REST API
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable long id, @RequestBody Student studentDetails){
        Student updateStudent = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student does not exist with this id:"+ id));
        updateStudent.setFirstName(studentDetails.getFirstName());
        updateStudent.setLastName(studentDetails.getLastName());
        updateStudent.setGender(studentDetails.getGender());
        updateStudent.setDob(studentDetails.getDob());
        updateStudent.setG_name(studentDetails.getG_name());
        updateStudent.setG_email(studentDetails.getG_email());
        updateStudent.setEmail(studentDetails.getEmail());
        updateStudent.setAddress(studentDetails.getAddress());
        updateStudent.setPhoneNumber(studentDetails.getPhoneNumber());

        studentRepository.save(updateStudent);
        return ResponseEntity.ok(updateStudent);
    }

    // implement delete student REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable long id){

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student does not exist with this id:"+ id));

        studentRepository.delete(student);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

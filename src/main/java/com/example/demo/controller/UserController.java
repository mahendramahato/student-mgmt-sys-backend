package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    public UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers(){ return userRepository.findAll(); }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User does not exist with this id:"+ id));
        return ResponseEntity.ok(user);
    }
}

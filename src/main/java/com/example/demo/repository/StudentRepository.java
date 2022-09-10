package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // all crud database methods

//    @Query("SELECT c from students c WHERE c.firstName = ?1")
    public List<Student> findByFirstName(String firstName);
}

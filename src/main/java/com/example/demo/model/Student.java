package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity( name = "students")
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private String dob;

    @Column(name = "address")
    private String address;

    @Column(name = "email_id")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "guardian_name")
    private String g_name;

    @Column(name = "guardian_email")
    private String g_email;

//    @OneToMany(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name = "student_id",
//            referencedColumnName = "id"
//    )
//    private List<Course> courses;

}

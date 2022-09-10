
package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long courseId;

    @Column(name = "title")
    private String title;

    @Column(name = "credits")
    private long credits;

//    @OneToOne(
//            mappedBy = "course"
//    )
//    private CourseMaterial courseMaterial;

//    @ManyToMany(
//            cascade = CascadeType.ALL
//    )
//    @JoinTable(
//            name = "student_course_map",
//            joinColumns = @JoinColumn(
//                name = "course_id",
//                    referencedColumnName = "courseId"
//            ),
//            inverseJoinColumns = @JoinColumn(
//                    name = "student_id",
//                    referencedColumnName = "id"
//            )
//    )
//    private List<Student> student;

}

package com.example.demo.model;


import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString(exclude = "course")
@Table(name = "course_material")
public class CourseMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseMaterialId;

    @Column(name = "url")
    private String url;

//    @OneToOne(
//            cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY
//    )
//    @JoinColumn(
//           name = "course_id",
//            referencedColumnName = "courseId"
//    )
//    private Course course;

}

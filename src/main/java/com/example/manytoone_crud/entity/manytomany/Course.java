package com.example.manytoone_crud.entity.manytomany;

import com.example.manytoone_crud.custom.CustomCourseSerializer;
import com.example.manytoone_crud.custom.CustomStudentSerializer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "course_control")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int id;
    @Column(name = "course_idcourse")
    private String idCourse;
    @Column(name = "course_total")
    private int total;
//    @ManyToMany(mappedBy = "listcourse", fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "student")

    private List<Student_Course> list;

}

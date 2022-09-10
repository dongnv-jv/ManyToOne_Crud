package com.example.manytoone_crud.entity.manytomany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="student_course")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CommonId.class)
public class Student_Course  {
    @Id
    @Column(name="student_id_1")
    private int studentid;
    @Id
    @Column(name="course_id_1")
    private int courseid;
    @Column(name="register_date")
    private String date;
    @ManyToOne
    @MapsId("studentid")
    @JoinColumn(name="student_id_1")
    private Student student;

    @ManyToOne
    @MapsId("courseid")
    @JoinColumn(name="course_id_1")
    private Course course;

}

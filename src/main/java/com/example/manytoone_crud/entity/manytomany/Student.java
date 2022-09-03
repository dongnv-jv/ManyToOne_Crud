package com.example.manytoone_crud.entity.manytomany;

import com.example.manytoone_crud.custom.CustomCourseSerializer;
import com.example.manytoone_crud.custom.CustomStudentSerializer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;
    @Column(name = "student_idst")
    @NotBlank
    @Size(min=3)
    private String idSt;
    @Column(name = "student_name")
    @NotBlank
    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
//    @JsonManagedReference
    @JoinTable(name = "student_course",
            joinColumns = @JoinColumn(name = "student_id_1",referencedColumnName = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id_1",referencedColumnName = "course_id"))
    @JsonSerialize(using = CustomStudentSerializer.class)
    private List<Course> listcourse;

}

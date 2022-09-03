package com.example.manytoone_crud.service.manytomanyservice;

import com.example.manytoone_crud.entity.manytomany.Course;
import com.example.manytoone_crud.repository.manytomanyrepository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private ICourseRepository iCourseRepository;
    public List<Course> getAllCourse(){
        return iCourseRepository.findAll();
    }
}

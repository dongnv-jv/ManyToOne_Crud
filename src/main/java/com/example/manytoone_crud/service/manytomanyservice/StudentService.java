package com.example.manytoone_crud.service.manytomanyservice;

import com.example.manytoone_crud.entity.manytomany.Course;
import com.example.manytoone_crud.entity.manytomany.Student;
import com.example.manytoone_crud.repository.manytomanyrepository.ICourseRepository;
import com.example.manytoone_crud.repository.manytomanyrepository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository iStudentRepository;
    @Autowired
    private ICourseRepository iCourseRepository;

    public List<Student> getAllStudent(){
        return iStudentRepository.findAll();
    }

//    public List<Student>  getStudentByCourseId(int id){
//        Optional<Course> course= iCourseRepository.findById(id);
//        List<Student> liststudent= new ArrayList<>();
//        for (Student student: course.get().getStudentList() ) {
//            liststudent.add(student);
//        }
//        return liststudent;
//    }
    public Student saveStudent(Student student){

        return iStudentRepository.save(student);
    }
}

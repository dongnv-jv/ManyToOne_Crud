package com.example.manytoone_crud.repository.manytomanyrepository;

import com.example.manytoone_crud.entity.manytomany.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends JpaRepository<Course,Integer> {
}

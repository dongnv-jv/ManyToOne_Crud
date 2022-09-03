package com.example.manytoone_crud.repository.manytomanyrepository;

import com.example.manytoone_crud.entity.manytomany.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer> {
//    @Query("select s from Student s where s.listcourse.id=?1 ")
//    List<City> findStudentByCourseId(int id);
}

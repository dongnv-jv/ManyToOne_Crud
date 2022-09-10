package com.example.manytoone_crud.controller;

import com.example.manytoone_crud.entity.manytoone.City;
import com.example.manytoone_crud.entity.manytomany.Student;
import com.example.manytoone_crud.service.manytooneservice.CityService;
import com.example.manytoone_crud.service.manytooneservice.CountryService;
import com.example.manytoone_crud.service.manytomanyservice.CourseService;
import com.example.manytoone_crud.service.manytomanyservice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class HomeController {


    @Autowired
    private CityService cityService;
    @Autowired
    private CountryService countryService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

// Many to One Test
    @GetMapping("/hello")
    public String sayHello() {
        return "Hellooooooo";
    }

    @GetMapping("/getcities")
    public ResponseEntity<?> getAllCity() {
        return ResponseEntity.ok().body(cityService.getAll());
    }

    @PostMapping("/addcity")
    public ResponseEntity<?> addCity(@RequestBody City city) {
        return ResponseEntity.ok().body(cityService.addCity(city));
    }

    @GetMapping("/getcountries")
    public ResponseEntity<?> getAllCountry() {
        return ResponseEntity.ok().body(countryService.getAllCountry());
    }

    @GetMapping("/get-cities-by-idcountry")
    public ResponseEntity<?> getCityByIdCountry(@RequestParam("idCountry") int id) {
        return ResponseEntity.ok().body(cityService.getByCountry(id));
    }

    @GetMapping("/getCountry")
    public ResponseEntity<?> findByIdCountry(@RequestParam("id") int id) {
        return ResponseEntity.ok().body(countryService.getCountryById(id));
    }
    // Many to Many Test
    @GetMapping("/getstudents")
    public ResponseEntity<?> getAllStudent() {
        return ResponseEntity.ok().body(studentService.getAllStudent());
    }
    @GetMapping("/getcourses")
    public ResponseEntity<?> getAllCourse() {
        return ResponseEntity.ok().body(courseService.getAllCourse());
    }
//    @GetMapping("/get-student-by-id-course")
//    public ResponseEntity<?> getStudentByCourseId(@RequestParam("id") int id) {
//        return ResponseEntity.ok().body(studentService.getStudentByCourseId(id));
//    }
    @PostMapping("/savest")
    public ResponseEntity<?> saveStudent(@Valid @RequestBody Student student){
        return ResponseEntity.ok().body(studentService.saveStudent(student));
    }
}

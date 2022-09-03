package com.example.manytoone_crud.custom;

import com.example.manytoone_crud.entity.manytomany.Course;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CustomStudentSerializer extends StdSerializer<List<Course>> {

    public CustomStudentSerializer() {
        this(null);
    }
    public CustomStudentSerializer(Class<List<Course>> t) {
        super(t);
    }
    @Override
    public void serialize(
            List<Course> courses,JsonGenerator generator,SerializerProvider provider)
            throws IOException, JsonProcessingException {
        List<WriteCourseStudent> ids = new ArrayList<>();
        for (Course course : courses) {
            WriteCourseStudent courseStudent= new WriteCourseStudent();
            courseStudent.setId(course.getId());
            ids.add(courseStudent);
        }
        generator.writeObject(ids);
    }
}

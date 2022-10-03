package com.example.manytoone_crud.custom;

import com.example.manytoone_crud.entity.manytomany.Student;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomCourseSerializer extends StdSerializer<List<Student>> {
    public CustomCourseSerializer() {
        this(null);
    }
    public CustomCourseSerializer(Class<List<Student>> t) {
        super(t);
    }
    @Override
    public void serialize(
            List<Student> items,
            JsonGenerator generator,
            SerializerProvider provider)
            throws IOException, JsonProcessingException {
        List<WriteObjectJson> ids = new ArrayList<>();
        for (Student student : items) {
//            ids.add(student.getId());
            WriteObjectJson courseStudent= new WriteObjectJson();
            courseStudent.setId(student.getId());
            ids.add(courseStudent);
        }
        generator.writeObject(ids);
    }

}

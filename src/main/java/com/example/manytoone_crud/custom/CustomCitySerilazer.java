package com.example.manytoone_crud.custom;

import com.example.manytoone_crud.entity.manytoone.City;
import com.example.manytoone_crud.entity.manytoone.Countries;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomCitySerilazer extends StdSerializer<Countries> {
    public CustomCitySerilazer(){
        this(null);
    }
    public CustomCitySerilazer(Class<Countries> t){
        super(t);
    }



    @Override
    public void serialize(Countries countries, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        List<WriteObjectJson> ids = new ArrayList<>();

            WriteObjectJson objectJson= new WriteObjectJson();
            objectJson.setName(countries.getCountryname());
            objectJson.setId(countries.getId());
            ids.add(objectJson);

        jsonGenerator.writeObject(ids);
    }
}

package com.example.manytoone_crud.custom;

import com.example.manytoone_crud.entity.manytoone.City;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomCountrySerilazer extends StdSerializer<List<City>> {

    public CustomCountrySerilazer() {
        this(null);
    }
    public CustomCountrySerilazer(Class<List<City>> t) {
        super(t);
    }
    @Override
    public void serialize(List<City> cityList, JsonGenerator generator, SerializerProvider provider)
            throws IOException, JsonProcessingException {
        List<WriteObjectJson> ids = new ArrayList<>();
        for (City city : cityList) {
            WriteObjectJson objectJson= new WriteObjectJson();
            objectJson.setName(city.getCityname());
            objectJson.setId(city.getId());
            ids.add(objectJson);
        }
        generator.writeObject(ids);
    }


}

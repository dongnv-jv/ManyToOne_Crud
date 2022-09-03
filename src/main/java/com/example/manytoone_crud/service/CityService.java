package com.example.manytoone_crud.service;

import com.example.manytoone_crud.entity.City;
import com.example.manytoone_crud.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private ICityRepository iCityRepository;

    public List<City> getAll(){
        return iCityRepository.findAll();
    }

    public City addCity(City city){
        return iCityRepository.save(city);
    }
    public List<City> getByCountry(int id){
        return iCityRepository.findCityByCountry(id);
    }
}

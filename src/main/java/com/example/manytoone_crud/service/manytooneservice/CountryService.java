package com.example.manytoone_crud.service.manytooneservice;

import com.example.manytoone_crud.entity.manytoone.City;
import com.example.manytoone_crud.entity.manytoone.Countries;
import com.example.manytoone_crud.repository.manytoon_repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private ICountryRepository iCountryRepository;

    public List<Countries> getAllCountry(){
        return iCountryRepository.findAll();
    }
    public List<City>  getCountryById(int id){
        Optional<Countries> countries= iCountryRepository.findById(id);
        List<City> cities= new ArrayList<>();
        for (City city: countries.get().getCityList() ) {
            cities.add(city);
        }
        return cities;
    }
}

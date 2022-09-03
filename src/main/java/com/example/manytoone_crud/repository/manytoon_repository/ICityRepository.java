package com.example.manytoone_crud.repository.manytoon_repository;

import com.example.manytoone_crud.entity.manytoone.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICityRepository extends JpaRepository<City,Integer> {
   @Query("select c from City c where c.countries.id=?1 ")
    List<City> findCityByCountry( int id);
}

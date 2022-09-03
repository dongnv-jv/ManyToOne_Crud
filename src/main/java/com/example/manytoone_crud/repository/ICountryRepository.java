package com.example.manytoone_crud.repository;

import com.example.manytoone_crud.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends JpaRepository<Countries,Integer> {
}

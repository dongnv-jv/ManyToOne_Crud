package com.example.manytoone_crud.repository.manytoon_repository;

import com.example.manytoone_crud.entity.manytoone.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends JpaRepository<Countries,Integer> {
}

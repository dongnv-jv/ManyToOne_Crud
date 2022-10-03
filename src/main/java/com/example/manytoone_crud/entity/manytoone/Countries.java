package com.example.manytoone_crud.entity.manytoone;

import com.example.manytoone_crud.custom.CustomCountrySerilazer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "countries")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private int id;
    @Column(name = "country_name")
    private String countryname;

    @JsonSerialize(using = CustomCountrySerilazer.class)
    @OneToMany(mappedBy = "countries")
    private List<City> cityList;


}

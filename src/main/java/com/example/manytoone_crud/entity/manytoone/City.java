package com.example.manytoone_crud.entity.manytoone;

import com.example.manytoone_crud.custom.CustomCitySerilazer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="cities")
@Data
@NoArgsConstructor@AllArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="city_id")
    private int id;
    @Column(name="city_name")
    private String cityname;
    @ManyToOne
    @JsonSerialize(using = CustomCitySerilazer.class)
    @JoinColumn(name = "country_id")
    private Countries countries;
}

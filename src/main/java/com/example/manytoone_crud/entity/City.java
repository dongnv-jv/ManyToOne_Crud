package com.example.manytoone_crud.entity;

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
    @JoinColumn(name = "country_id")
    private Countries countries;
}

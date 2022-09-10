package com.example.manytoone_crud.entity.manytomany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.IdClass;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CommonId implements Serializable {
    private int studentid;
    private int courseid;
}

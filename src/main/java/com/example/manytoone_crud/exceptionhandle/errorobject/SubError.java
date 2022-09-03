package com.example.manytoone_crud.exceptionhandle.errorobject;

import lombok.Data;

@Data
public class SubError {
    private String object;
    private String field;
    private String message;

}

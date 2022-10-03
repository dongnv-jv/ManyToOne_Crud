package com.example.manytoone_crud.exceptionhandle.errorobject;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class ResponseError {
    private HttpStatus status;
    private Date timestamp;
    private String message;
    private List<SubError> listsubError;

    public ResponseError() {
        listsubError= new ArrayList<SubError>();
    }

    public void addSubError(List<FieldError> errorList) {
        for (FieldError fieldError : errorList) {
            addSubError(fieldError);
        }
    }
    private void addSubError(FieldError error) {
        SubError subError= new SubError();
        subError.setField(error.getField());
        subError.setObject(error.getObjectName());
        subError.setMessage(error.getDefaultMessage());
        listsubError.add(subError);
    }
}

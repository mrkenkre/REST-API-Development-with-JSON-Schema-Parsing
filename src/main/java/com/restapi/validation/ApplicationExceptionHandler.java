package com.restapi.validation;

import com.restapi.validation.exceptions.MedPlanNotFoundException;
import org.everit.json.schema.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex){
        Map<String, String> errorMap=new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error->{
            errorMap.put(error.getField(),error.getDefaultMessage());
        });
        return errorMap;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(MedPlanNotFoundException.class)
    public Map<String, String> handleBussinessException(MedPlanNotFoundException ex){
        Map<String, String> errorMap=new HashMap<>();
        errorMap.put("errorMessage",ex.getMessage());
        return errorMap;

    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Map<String, String> handleHttpMessageNotReadable(HttpMessageNotReadableException ex){
        Map<String, String> errorMap=new HashMap<>();
        errorMap.put("errorMessage",ex.getMessage());
        return errorMap;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidationException.class)
    public Map<String, String> handleHttpMessageNotReadable(ValidationException ex){
        Map<String, String> errorMap=new HashMap<>();
        errorMap.put("errorMessage",ex.getMessage());
        return errorMap;
    }



}

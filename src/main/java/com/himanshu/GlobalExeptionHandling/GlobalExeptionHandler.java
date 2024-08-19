package com.himanshu.GlobalExeptionHandling;

import com.himanshu.util.ExceptionApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestControllerAdvice
public class GlobalExeptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionApiResponse StudentNotFoundExtionMethod(StudentNotFoundException studentNotFoundException){
        ExceptionApiResponse exceptionApiResponse=new ExceptionApiResponse();
        exceptionApiResponse.setFlag(false);
        exceptionApiResponse.setMessage(studentNotFoundException.getMessage());
        return exceptionApiResponse;
    }

    @ExceptionHandler(StudentNotFoundWithMobException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionApiResponse StudentNotFoundExtionMethod(StudentNotFoundWithMobException studentNotFoundWithMobException){
        ExceptionApiResponse exceptionApiResponse=new ExceptionApiResponse();
        exceptionApiResponse.setFlag(false);
        exceptionApiResponse.setMessage(studentNotFoundWithMobException.getMessage());
        return exceptionApiResponse;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public HashMap<String,String> beanValidationException(MethodArgumentNotValidException ex){
        HashMap<String,String>hm=new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach((error)->{
            hm.put(error.getField(), error.getDefaultMessage());

        });
        return hm;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionApiResponse StudentNotFoundExtionMethod(Exception exception){
        ExceptionApiResponse exceptionApiResponse=new ExceptionApiResponse();
        exceptionApiResponse.setFlag(false);
        exceptionApiResponse.setMessage(exception.getMessage());
        return exceptionApiResponse;
    }


}

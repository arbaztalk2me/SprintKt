package com.himanshu.GlobalExeptionHandling;

public class StudentNotFoundWithMobException extends RuntimeException{
    public StudentNotFoundWithMobException(String message) {
        super(message);
    }
}

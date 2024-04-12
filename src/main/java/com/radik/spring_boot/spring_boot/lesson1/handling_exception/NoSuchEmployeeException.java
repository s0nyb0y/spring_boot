package com.radik.spring_boot.spring_boot.lesson1.handling_exception;

public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}

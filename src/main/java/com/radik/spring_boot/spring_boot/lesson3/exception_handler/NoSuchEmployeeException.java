package com.radik.spring_boot.spring_boot.lesson3.exception_handler;

public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}

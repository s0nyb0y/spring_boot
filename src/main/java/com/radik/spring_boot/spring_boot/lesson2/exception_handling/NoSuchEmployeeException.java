package com.radik.spring_boot.spring_boot.lesson2.exception_handling;

public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}

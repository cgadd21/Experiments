package com.springboot.springboot.exceptions;

public class EducationNotFoundException extends RuntimeException {
    public EducationNotFoundException(String message) {
        super(message);
    }
}

package com.springboot.springboot.exceptions;

public class ExperienceNotFoundException extends RuntimeException {
    public ExperienceNotFoundException(String message) {
        super(message);
    }
}

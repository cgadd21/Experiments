package com.springboot.springboot.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.springboot.services.EducationService;
import com.springboot.springboot.models.Education;

@RestController
@RequestMapping("/education")
public class EducationController {
    private final EducationService educationService;
    
    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping
    public ResponseEntity<List<Education>> getEducation() {
        List<Education> educations = educationService.getEducation();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Education> getEducation(@PathVariable("id") long id) {
        Education education = educationService.getEducation(id);
        return new ResponseEntity<>(education, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Education> createEducation(@RequestBody Education education) {
        Education newEducation = educationService.createEducation(education);
        return new ResponseEntity<>(newEducation, HttpStatus.CREATED); 
    }

    @PutMapping
    public ResponseEntity<Education> updateEducation(@RequestBody Education education) {
        Education updateEducation = educationService.updateEducation(education);
        return new ResponseEntity<>(updateEducation, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") long id) {
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

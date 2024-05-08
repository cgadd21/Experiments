package com.springboot.springboot.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.springboot.services.ExperienceService;
import com.springboot.springboot.models.Experience;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    private final ExperienceService experienceService;
    
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    public ResponseEntity<List<Experience>> getExperience() {
        List<Experience> experiences = experienceService.getExperience();
        return new ResponseEntity<>(experiences, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Experience> getExperience(@PathVariable("id") long id) {
        Experience experience = experienceService.getExperience(id);
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Experience> createExperience(@RequestBody Experience experience) {
        Experience newExperience = experienceService.createExperience(experience);
        return new ResponseEntity<>(newExperience, HttpStatus.CREATED); 
    }

    @PutMapping
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experience) {
        Experience updateExperience = experienceService.updateExperience(experience);
        return new ResponseEntity<>(updateExperience, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable("id") long id) {
        experienceService.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

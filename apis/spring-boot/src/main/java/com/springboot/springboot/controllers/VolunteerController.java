package com.springboot.springboot.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.springboot.services.VolunteerService;
import com.springboot.springboot.models.Volunteer;

@RestController
@RequestMapping("/volunteer")
public class VolunteerController {
    private final VolunteerService volunteerService;
    
    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    @GetMapping
    public ResponseEntity<List<Volunteer>> getVolunteer() {
        List<Volunteer> volunteers = volunteerService.getVolunteer();
        return new ResponseEntity<>(volunteers, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Volunteer> getVolunteer(@PathVariable("id") long id) {
        Volunteer volunteer = volunteerService.getVolunteer(id);
        return new ResponseEntity<>(volunteer, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Volunteer> createVolunteer(@RequestBody Volunteer volunteer) {
        Volunteer newVolunteer = volunteerService.createVolunteer(volunteer);
        return new ResponseEntity<>(newVolunteer, HttpStatus.CREATED); 
    }

    @PutMapping
    public ResponseEntity<Volunteer> updateVolunteer(@RequestBody Volunteer volunteer) {
        Volunteer updateVolunteer = volunteerService.updateVolunteer(volunteer);
        return new ResponseEntity<>(updateVolunteer, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteVolunteer(@PathVariable("id") long id) {
        volunteerService.deleteVolunteer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

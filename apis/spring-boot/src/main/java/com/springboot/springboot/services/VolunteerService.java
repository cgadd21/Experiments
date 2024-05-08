package com.springboot.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.springboot.exceptions.VolunteerNotFoundException;
import com.springboot.springboot.models.Volunteer;
import com.springboot.springboot.repositories.VolunteerRepository;

@Service
public class VolunteerService {
    private final VolunteerRepository volunteerRepository;

    public VolunteerService(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    public List<Volunteer> getVolunteer() {
        return volunteerRepository.findAll();
    }

    public Volunteer getVolunteer(Long volunteerId) {
        return volunteerRepository.findVolunteerByVolunteerId(volunteerId)
            .orElseThrow(() -> new VolunteerNotFoundException("Volunteer by id " + " was not found"));
    }

    public Volunteer createVolunteer(Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }
    
    public Volunteer updateVolunteer(Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }
    
    public void deleteVolunteer(Long volunteerId) {
        volunteerRepository.deleteVolunteerByVolunteerId(volunteerId);
    }
}

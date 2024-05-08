package com.springboot.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.springboot.exceptions.ExperienceNotFoundException;
import com.springboot.springboot.models.Experience;
import com.springboot.springboot.repositories.ExperienceRepository;

@Service
public class ExperienceService {
    private final ExperienceRepository experienceRepository;

    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public List<Experience> getExperience() {
        return experienceRepository.findAll();
    }

    public Experience getExperience(Long experienceId) {
        return experienceRepository.findExperienceByExperienceId(experienceId)
            .orElseThrow(() -> new ExperienceNotFoundException("Experience by id " + experienceId + " was not found"));
    }

    public Experience createExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    public Experience updateExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    public void deleteExperience(Long experienceId) {
        experienceRepository.deleteExperienceByExperienceId(experienceId);
    }
}

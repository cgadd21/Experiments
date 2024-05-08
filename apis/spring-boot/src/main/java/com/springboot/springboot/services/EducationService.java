package com.springboot.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.springboot.exceptions.EducationNotFoundException;
import com.springboot.springboot.models.Education;
import com.springboot.springboot.repositories.EducationRepository;

@Service
public class EducationService {
    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public List<Education> getEducation() {
        return educationRepository.findAll();
    }

    public Education getEducation(Long educationId) {
        return educationRepository.findEducationByEducationId(educationId)
            .orElseThrow(() -> new EducationNotFoundException("Education by id " + educationId + " was not found"));
    }

    public Education createEducation(Education education) {
        return educationRepository.save(education);
    }

    public Education updateEducation(Education education) {
        return educationRepository.save(education);
    }

    public void deleteEducation(Long educationId) {
        educationRepository.deleteEducationByEducationId(educationId);
    }
}

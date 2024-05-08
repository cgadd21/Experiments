package com.springboot.springboot.repositories;

import java.util.Optional;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.*;
import com.springboot.springboot.models.Education;

public interface EducationRepository extends JpaRepository<Education,Long> {
    Optional<Education> findEducationByEducationId(Long educationId);
    
    @Transactional
    void deleteEducationByEducationId(Long educationId);
}

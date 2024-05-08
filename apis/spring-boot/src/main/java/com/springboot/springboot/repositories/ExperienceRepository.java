package com.springboot.springboot.repositories;

import java.util.Optional;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.*;
import com.springboot.springboot.models.Experience;

public interface ExperienceRepository extends JpaRepository<Experience,Long> {
    Optional<Experience> findExperienceByExperienceId(Long experienceId);

    @Transactional
    void deleteExperienceByExperienceId(Long experienceId);
}

package com.springboot.springboot.repositories;

import java.util.Optional;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.*;
import com.springboot.springboot.models.Volunteer;

public interface VolunteerRepository extends JpaRepository<Volunteer,Long>{
    Optional<Volunteer> findVolunteerByVolunteerId(Long volunteerId);

    @Transactional
    void deleteVolunteerByVolunteerId(Long volunteerId);
}

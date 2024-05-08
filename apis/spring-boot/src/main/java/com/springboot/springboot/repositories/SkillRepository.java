package com.springboot.springboot.repositories;

import java.util.Optional;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.*;
import com.springboot.springboot.models.Skill;

public interface SkillRepository extends JpaRepository<Skill,Long>{
    Optional<Skill> findSkillBySkillId(Long skillID);

    @Transactional
    void deleteSkillBySkillId(Long skillID);
}

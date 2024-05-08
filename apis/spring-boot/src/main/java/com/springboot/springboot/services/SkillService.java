package com.springboot.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.springboot.exceptions.SkillNotFoundException;
import com.springboot.springboot.models.Skill;
import com.springboot.springboot.repositories.SkillRepository;

@Service
public class SkillService {
    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<Skill> getSkill() {
        return skillRepository.findAll();
    }

    public Skill getSkill(Long skillId) {
        return skillRepository.findSkillBySkillId(skillId)
            .orElseThrow(() -> new SkillNotFoundException("Skill by id " + skillId + " was not found"));
    }

    public Skill createSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public Skill updateSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public void deleteSkill(Long skillId) {
        skillRepository.deleteSkillBySkillId(skillId);
    }
}

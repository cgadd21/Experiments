package com.springboot.springboot.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.springboot.services.SkillService;
import com.springboot.springboot.models.Skill;

@RestController
@RequestMapping("/skill")
public class SkillController {
    private final SkillService skillService;
    
    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping
    public ResponseEntity<List<Skill>> getSkill() {
        List<Skill> skills = skillService.getSkill();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Skill> getSkill(@PathVariable("id") long id) {
        Skill skill = skillService.getSkill(id);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Skill> createSkill(@RequestBody Skill skill) {
        Skill newSkill = skillService.createSkill(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED); 
    }

    @PutMapping
    public ResponseEntity<Skill> updateSkill(@RequestBody Skill skill) {
        Skill updateSkill = skillService.updateSkill(skill);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") long id) {
        skillService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

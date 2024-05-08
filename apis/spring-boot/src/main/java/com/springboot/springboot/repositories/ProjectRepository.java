package com.springboot.springboot.repositories;

import java.util.Optional;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.*;
import com.springboot.springboot.models.Project;

public interface ProjectRepository extends JpaRepository<Project,Long>{
    Optional<Project> findProjectByProjectId(Long projectId);

    @Transactional
    void deleteProjectByProjectId(Long projectId);
}

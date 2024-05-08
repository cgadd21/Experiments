package com.springboot.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.springboot.exceptions.ProjectNotFoundException;
import com.springboot.springboot.models.Project;
import com.springboot.springboot.repositories.ProjectRepository;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getProject() {
        return projectRepository.findAll();
    }

    public Project getProject(Long projectId) {
        return projectRepository.findProjectByProjectId(projectId)
            .orElseThrow(() -> new ProjectNotFoundException("Project by id " + projectId + " was not found"));
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }

    public void deleteProject(Long projectId) {
        projectRepository.deleteProjectByProjectId(projectId);
    }
}

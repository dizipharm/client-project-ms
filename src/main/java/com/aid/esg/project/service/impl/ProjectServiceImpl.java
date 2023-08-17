package com.aid.esg.project.service.impl;

import com.aid.esg.project.dto.ProjectDto;
import com.aid.esg.project.mapper.ProjectMapper;
import com.aid.esg.project.model.Project;
import com.aid.esg.project.repository.ProjectRepository;
import com.aid.esg.project.service.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.aid.esg.project.mapper.ProjectMapper.mapToProject;
import static com.aid.esg.project.mapper.ProjectMapper.mapToProjectDto;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {

   private ProjectRepository projectRepository;

    @Override
    public ProjectDto createProduct(ProjectDto projectDto) {
        projectDto.setReference(String.valueOf(UUID.randomUUID()));
        Project project = mapToProject(projectDto);
        Project savedProduct = projectRepository.save(project);
        return mapToProjectDto(savedProduct);
    }

    public List<ProjectDto> getProductAll() {
        List<Project> products = projectRepository.findAll();
        return products.stream().map(ProjectMapper::mapToProjectDto).collect(Collectors.toList());
    }
}

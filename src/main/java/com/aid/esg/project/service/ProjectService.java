package com.aid.esg.project.service;

import com.aid.esg.project.dto.ProjectDto;

import java.util.List;

public interface ProjectService {

    ProjectDto createProduct(ProjectDto projectDto);

    List<ProjectDto> getProductAll();
}

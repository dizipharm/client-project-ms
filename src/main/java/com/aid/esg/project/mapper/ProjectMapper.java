package com.aid.esg.project.mapper;


import com.aid.esg.project.dto.ProjectDto;
import com.aid.esg.project.model.Project;

public class ProjectMapper {

    public static ProjectDto mapToProjectDto(Project project) {
        return new ProjectDto(
                project.getId(),
                project.getContractorCompanyName(),
                project.getContractName(),
                project.getProjectName(),
                project.getContractId(),
                project.getProjectManager(),
                project.getReference(),
                project.getStartDate(),
                project.getEndDate(),
                project.getPrice(),
                project.getType()
        );
      }

    public static Project mapToProject(ProjectDto projectDto) {
        return new Project(
                projectDto.getId(),
                projectDto.getContractorCompanyName(),
                projectDto.getContractName(),
                projectDto.getProjectName(),
                projectDto.getContractId(),
                projectDto.getProjectManager(),
                projectDto.getReference(),
                projectDto.getStartDate(),
                projectDto.getEndDate(),
                projectDto.getPrice(),
                projectDto.getType()
        );
    }
}
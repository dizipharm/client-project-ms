package com.aid.esg.project.controller;

import com.aid.esg.project.dto.ProjectDto;
import com.aid.esg.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public ResponseEntity<ProjectDto> createProduct(@RequestBody ProjectDto projectDto) {
        ProjectDto savedProduct = projectService.createProduct(projectDto);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping
    public List<ProjectDto> findAllProducts() {
        return projectService.getProductAll();
    }
}
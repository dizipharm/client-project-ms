package com.aid.esg.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {
    private Long id;
    private String contractorCompanyName;
    private String contractName;
    private String projectName;
    private String contractId;
    private String projectManager;
    private String reference;
    private String startDate;
    private String endDate;
    private String price;
    private String type;
}

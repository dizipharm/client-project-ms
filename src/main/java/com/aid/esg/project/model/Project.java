package com.aid.esg.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PROJECT_DTLS")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contractor_company_name")
    private String contractorCompanyName;

    @Column(name = "contract_name")
    private String contractName;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "contract_id")
    private String contractId;

    @Column(name = "project_manager")
    private String projectManager;

    @Column(name = "reference")
    private String reference;

    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    @Column(name = "start_date")
    private String startDate;

    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    @Column(name = "end_date")
    private String endDate;

    @Column(name = "price")
    private String price;

    @Column(name = "type")
    private String type;
}

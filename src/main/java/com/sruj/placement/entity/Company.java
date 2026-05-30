package com.sruj.placement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Company name cannot be empty")
    private String companyName;

    @NotBlank(message = "Role cannot be empty")
    private String role;

    @NotNull(message = "Package is required")
    @Positive(message = "Package must be positive")
    private Double packageOffered;

    @NotNull(message = "Eligibility CGPA is required")
    @Positive(message = "Eligibility CGPA must be positive")
    private Double eligibilityCgpa;

    @NotBlank(message = "Location cannot be empty")
    private String location;

    public Company() {
    }

    public Company(Long id, String companyName, String role,
                   Double packageOffered, Double eligibilityCgpa,
                   String location) {

        this.id = id;
        this.companyName = companyName;
        this.role = role;
        this.packageOffered = packageOffered;
        this.eligibilityCgpa = eligibilityCgpa;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getPackageOffered() {
        return packageOffered;
    }

    public void setPackageOffered(Double packageOffered) {
        this.packageOffered = packageOffered;
    }

    public Double getEligibilityCgpa() {
        return eligibilityCgpa;
    }

    public void setEligibilityCgpa(Double eligibilityCgpa) {
        this.eligibilityCgpa = eligibilityCgpa;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
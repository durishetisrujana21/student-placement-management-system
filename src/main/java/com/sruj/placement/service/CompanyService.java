package com.sruj.placement.service;

import com.sruj.placement.entity.Company;
import com.sruj.placement.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    // CREATE
    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    // GET ALL
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    // GET BY ID
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    // UPDATE
    public Company updateCompany(Long id, Company updatedCompany) {

        Company company = companyRepository.findById(id).orElse(null);

        if (company != null) {
            company.setCompanyName(updatedCompany.getCompanyName());
            company.setRole(updatedCompany.getRole());
            company.setPackageOffered(updatedCompany.getPackageOffered());
            company.setEligibilityCgpa(updatedCompany.getEligibilityCgpa());
            company.setLocation(updatedCompany.getLocation());

            return companyRepository.save(company);
        }

        return null;
    }

    // DELETE
    public String deleteCompany(Long id) {
        companyRepository.deleteById(id);
        return "Company deleted successfully";
    }
}

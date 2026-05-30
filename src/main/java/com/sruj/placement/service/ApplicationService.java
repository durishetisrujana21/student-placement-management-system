package com.sruj.placement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sruj.placement.entity.Application;
import com.sruj.placement.repository.ApplicationRepository;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    // CREATE
    public Application addApplication(Application application) {
        return applicationRepository.save(application);
    }

    // GET ALL
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    // GET BY ID
    public Application getApplicationById(Long id) {
        return applicationRepository.findById(id).orElse(null);
    }
    // UPDATE STATUS
public Application updateApplicationStatus(Long id, String status) {

    Application application =
            applicationRepository.findById(id).orElse(null);

    if (application != null) {
        application.setStatus(status);
        return applicationRepository.save(application);
    }

    return null;
}

    // DELETE
    public String deleteApplication(Long id) {
        applicationRepository.deleteById(id);
        return "Application deleted successfully";
    }
}
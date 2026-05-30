package com.sruj.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sruj.placement.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

    long countByStatus(String status);

}
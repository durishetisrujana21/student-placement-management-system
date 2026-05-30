package com.sruj.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sruj.placement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
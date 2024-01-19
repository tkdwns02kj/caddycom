package com.example.demo.repository;

import com.example.demo.entity.AssgnOpenDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssgnOpenDateRepository extends JpaRepository<AssgnOpenDate, Long> {
}

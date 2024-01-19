package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CaddieSchedule;

@Repository
public interface CaddieScheduleRepository extends JpaRepository<CaddieSchedule, Long> {
}

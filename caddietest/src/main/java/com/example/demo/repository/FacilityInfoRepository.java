package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FacilityInfo;

@Repository
public interface FacilityInfoRepository extends JpaRepository<FacilityInfo, Long> {
}

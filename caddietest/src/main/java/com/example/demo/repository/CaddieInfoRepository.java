package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CaddieInfo;

@Repository
public interface CaddieInfoRepository extends JpaRepository<CaddieInfo, Long> {
	// Additional custom queries can be added here if needed
}

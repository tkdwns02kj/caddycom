package com.example.demo.repository;

import com.example.demo.entity.TeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeeInfoRepository extends JpaRepository<TeeInfo, Long> {
}

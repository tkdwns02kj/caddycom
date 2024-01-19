package com.example.demo.repository;

import com.example.demo.entity.CourseGuide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseGuideRepository extends JpaRepository<CourseGuide, Long> {
}

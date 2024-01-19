package com.example.demo.repository;

import com.example.demo.entity.CourseList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseListRepository extends JpaRepository<CourseList, Long> {
}

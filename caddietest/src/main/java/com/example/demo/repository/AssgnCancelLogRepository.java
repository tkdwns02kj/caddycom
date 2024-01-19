package com.example.demo.repository;

import com.example.demo.entity.AssgnCancelLog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssgnCancelLogRepository extends JpaRepository<AssgnCancelLog, Long> {
	// 추가적인 쿼리 메서드가 필요하다면 여기에 추가할 수 있습니다.
}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long> {
	UserInfo findByUiId(String uiId);
}

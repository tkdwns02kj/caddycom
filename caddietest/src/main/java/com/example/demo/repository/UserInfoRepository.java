package com.example.demo.repository;

import com.example.demo.entity.UserInfo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    // 기본적인 CRUD 메서드는 JpaRepository에서 이미 제공됩니다.
    // 추가로 사용하고자 하는 메서드가 있다면 여기에 선언할 수 있습니다.
	Optional<UserInfo> findByUiId(String uiId);
}

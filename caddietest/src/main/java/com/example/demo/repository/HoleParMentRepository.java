package com.example.demo.repository;

import com.example.demo.entity.HoleParMent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoleParMentRepository extends JpaRepository<HoleParMent, Long> {
    // 추가로 사용하고자 하는 메서드가 있다면 여기에 선언할 수 있습니다.
}

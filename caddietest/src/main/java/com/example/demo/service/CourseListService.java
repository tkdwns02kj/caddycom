package com.example.demo.service;

import com.example.demo.dto.CourseListDTO;
import com.example.demo.entity.CourseList;
import com.example.demo.repository.CourseListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseListService {

	private final CourseListRepository courseListRepository;

	/**
	 * 모든 코스 리스트 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<CourseListDTO> getAllCourseListDTOs() {
		List<CourseList> courseLists = courseListRepository.findAll();
		return courseLists.stream().map(CourseListDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 코스 리스트 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public CourseListDTO getCourseListDTOById(Long clSeq) {
		return courseListRepository.findById(clSeq).map(CourseListDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 코스 리스트 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public CourseListDTO createCourseList(CourseListDTO courseListDTO) {
		CourseList courseList = CourseListDTO.toEntity(courseListDTO);
		CourseList savedLog = courseListRepository.save(courseList);
		return CourseListDTO.toDto(savedLog);
	}

	/**
	 * 특정 코스 리스트 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public CourseListDTO updateCourseList(Long clSeq, CourseListDTO updatedLogDTO) {
		return courseListRepository.findById(clSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			CourseList updatedLog = courseListRepository.save(existingLog);
			return CourseListDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 코스 리스트 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteCourseList(Long clSeq) {
		courseListRepository.deleteById(clSeq);
	}
}

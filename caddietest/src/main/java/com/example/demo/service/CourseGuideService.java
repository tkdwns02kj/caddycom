package com.example.demo.service;

import com.example.demo.dto.CourseGuideDTO;
import com.example.demo.entity.CourseGuide;
import com.example.demo.repository.CourseGuideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseGuideService {

	private final CourseGuideRepository courseGuideRepository;

	/**
	 * 모든 코스 가이드 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<CourseGuideDTO> getAllCourseGuideDTOs() {
		List<CourseGuide> courseGuides = courseGuideRepository.findAll();
		return courseGuides.stream().map(CourseGuideDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 코스 가이드 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public CourseGuideDTO getCourseGuideDTOById(Long cgSeq) {
		return courseGuideRepository.findById(cgSeq).map(CourseGuideDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 코스 가이드 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public CourseGuideDTO createCourseGuide(CourseGuideDTO courseGuideDTO) {
		CourseGuide courseGuide = CourseGuideDTO.toEntity(courseGuideDTO);
		CourseGuide savedLog = courseGuideRepository.save(courseGuide);
		return CourseGuideDTO.toDto(savedLog);
	}

	/**
	 * 특정 코스 가이드 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public CourseGuideDTO updateCourseGuide(Long cgSeq, CourseGuideDTO updatedLogDTO) {
		return courseGuideRepository.findById(cgSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			CourseGuide updatedLog = courseGuideRepository.save(existingLog);
			return CourseGuideDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 코스 가이드 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteCourseGuide(Long cgSeq) {
		courseGuideRepository.deleteById(cgSeq);
	}
}

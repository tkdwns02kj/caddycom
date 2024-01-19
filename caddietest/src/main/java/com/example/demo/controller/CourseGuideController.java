package com.example.demo.controller;

import com.example.demo.dto.CourseGuideDTO;
import com.example.demo.service.CourseGuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/course-guides")
public class CourseGuideController {

	private final CourseGuideService courseGuideService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<CourseGuideDTO> getAllCourseGuides() {
		return courseGuideService.getAllCourseGuideDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{cgSeq}")
	public CourseGuideDTO getCourseGuideById(@PathVariable Long cgSeq) {
		return courseGuideService.getCourseGuideDTOById(cgSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public CourseGuideDTO createCourseGuide(@RequestBody CourseGuideDTO courseGuideDTO) {
		return courseGuideService.createCourseGuide(courseGuideDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{cgSeq}")
	public CourseGuideDTO updateCourseGuide(@PathVariable Long cgSeq,
			@RequestBody CourseGuideDTO updatedLogDTO) {
		return courseGuideService.updateCourseGuide(cgSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{cgSeq}")
	public void deleteCourseGuide(@PathVariable Long cgSeq) {
		courseGuideService.deleteCourseGuide(cgSeq);
	}
}

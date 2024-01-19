package com.example.demo.controller;

import com.example.demo.dto.CourseListDTO;
import com.example.demo.service.CourseListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/course-lists")
public class CourseListController {

	private final CourseListService courseListService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<CourseListDTO> getAllCourseLists() {
		return courseListService.getAllCourseListDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{clSeq}")
	public CourseListDTO getCourseListById(@PathVariable Long clSeq) {
		return courseListService.getCourseListDTOById(clSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public CourseListDTO createCourseList(@RequestBody CourseListDTO courseListDTO) {
		return courseListService.createCourseList(courseListDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{clSeq}")
	public CourseListDTO updateCourseList(@PathVariable Long clSeq,
			@RequestBody CourseListDTO updatedLogDTO) {
		return courseListService.updateCourseList(clSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{clSeq}")
	public void deleteCourseList(@PathVariable Long clSeq) {
		courseListService.deleteCourseList(clSeq);
	}
}

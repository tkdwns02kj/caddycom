package com.example.demo.controller;

import com.example.demo.dto.FacilityListDTO;
import com.example.demo.service.FacilityListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/facility-lists")
public class FacilityListController {

	private final FacilityListService facilityListService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<FacilityListDTO> getAllFacilityLists() {
		return facilityListService.getAllFacilityListDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{flSeq}")
	public FacilityListDTO getFacilityListById(@PathVariable Long flSeq) {
		return facilityListService.getFacilityListDTOById(flSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public FacilityListDTO createFacilityList(@RequestBody FacilityListDTO facilityListDTO) {
		return facilityListService.createFacilityList(facilityListDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{flSeq}")
	public FacilityListDTO updateFacilityList(@PathVariable Long flSeq,
			@RequestBody FacilityListDTO updatedLogDTO) {
		return facilityListService.updateFacilityList(flSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{flSeq}")
	public void deleteFacilityList(@PathVariable Long flSeq) {
		facilityListService.deleteFacilityList(flSeq);
	}
}

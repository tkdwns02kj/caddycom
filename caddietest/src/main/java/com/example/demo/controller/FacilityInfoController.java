package com.example.demo.controller;

import com.example.demo.dto.FacilityInfoDTO;
import com.example.demo.service.FacilityInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/facility-infos")
public class FacilityInfoController {

	private final FacilityInfoService facilityInfoService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<FacilityInfoDTO> getAllFacilityInfos() {
		return facilityInfoService.getAllFacilityInfoDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{fiSeq}")
	public FacilityInfoDTO getFacilityInfoById(@PathVariable Long fiSeq) {
		return facilityInfoService.getFacilityInfoDTOById(fiSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public FacilityInfoDTO createFacilityInfo(@RequestBody FacilityInfoDTO facilityInfoDTO) {
		return facilityInfoService.createFacilityInfo(facilityInfoDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{fiSeq}")
	public FacilityInfoDTO updateFacilityInfo(@PathVariable Long fiSeq,
			@RequestBody FacilityInfoDTO updatedLogDTO) {
		return facilityInfoService.updateFacilityInfo(fiSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{fiSeq}")
	public void deleteFacilityInfo(@PathVariable Long fiSeq) {
		facilityInfoService.deleteFacilityInfo(fiSeq);
	}
}

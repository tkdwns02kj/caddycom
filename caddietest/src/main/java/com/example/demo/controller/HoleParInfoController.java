package com.example.demo.controller;

import com.example.demo.dto.HoleParInfoDTO;
import com.example.demo.service.HoleParInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/hole-par-infos")
public class HoleParInfoController {

	private final HoleParInfoService holeParInfoService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<HoleParInfoDTO> getAllHoleParInfos() {
		return holeParInfoService.getAllHoleParInfoDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{hpiSeq}")
	public HoleParInfoDTO getHoleParInfoById(@PathVariable Long hpiSeq) {
		return holeParInfoService.getHoleParInfoDTOById(hpiSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public HoleParInfoDTO createHoleParInfo(@RequestBody HoleParInfoDTO holeParInfoDTO) {
		return holeParInfoService.createHoleParInfo(holeParInfoDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{hpiSeq}")
	public HoleParInfoDTO updateHoleParInfo(@PathVariable Long hpiSeq,
			@RequestBody HoleParInfoDTO updatedLogDTO) {
		return holeParInfoService.updateHoleParInfo(hpiSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{hpiSeq}")
	public void deleteHoleParInfo(@PathVariable Long hpiSeq) {
		holeParInfoService.deleteHoleParInfo(hpiSeq);
	}
}

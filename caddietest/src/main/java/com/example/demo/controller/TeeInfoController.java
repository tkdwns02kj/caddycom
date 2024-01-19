package com.example.demo.controller;

import com.example.demo.dto.TeeInfoDTO;
import com.example.demo.service.TeeInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tee-infos")
public class TeeInfoController {

	private final TeeInfoService teeInfoService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<TeeInfoDTO> getAllTeeInfos() {
		return teeInfoService.getAllTeeInfoDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{tiSeq}")
	public TeeInfoDTO getTeeInfoById(@PathVariable Long tiSeq) {
		return teeInfoService.getTeeInfoDTOById(tiSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public TeeInfoDTO createTeeInfo(@RequestBody TeeInfoDTO teeInfoDTO) {
		return teeInfoService.createTeeInfo(teeInfoDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{tiSeq}")
	public TeeInfoDTO updateTeeInfo(@PathVariable Long tiSeq,
			@RequestBody TeeInfoDTO updatedLogDTO) {
		return teeInfoService.updateTeeInfo(tiSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{tiSeq}")
	public void deleteTeeInfo(@PathVariable Long tiSeq) {
		teeInfoService.deleteTeeInfo(tiSeq);
	}
}

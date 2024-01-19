package com.example.demo.controller;

import com.example.demo.dto.GolfInfoDTO;
import com.example.demo.service.GolfInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/golf-infos")
public class GolfInfoController {

	private final GolfInfoService golfInfoService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<GolfInfoDTO> getAllGolfInfos() {
		return golfInfoService.getAllGolfInfoDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{giSeq}")
	public GolfInfoDTO getGolfInfoById(@PathVariable Long giSeq) {
		return golfInfoService.getGolfInfoDTOById(giSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public GolfInfoDTO createGolfInfo(@RequestBody GolfInfoDTO golfInfoDTO) {
		return golfInfoService.createGolfInfo(golfInfoDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{giSeq}")
	public GolfInfoDTO updateGolfInfo(@PathVariable Long giSeq,
			@RequestBody GolfInfoDTO updatedLogDTO) {
		return golfInfoService.updateGolfInfo(giSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{giSeq}")
	public void deleteGolfInfo(@PathVariable Long giSeq) {
		golfInfoService.deleteGolfInfo(giSeq);
	}
}

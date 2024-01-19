package com.example.demo.controller;

import com.example.demo.dto.CaddieInfoDTO;
import com.example.demo.service.CaddieInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/caddie-infos")
public class CaddieInfoController {

	private final CaddieInfoService caddieInfoService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<CaddieInfoDTO> getAllCaddieInfos() {
		return caddieInfoService.getAllCaddieInfoDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{cdiSeq}")
	public CaddieInfoDTO getCaddieInfoById(@PathVariable Long cdiSeq) {
		return caddieInfoService.getCaddieInfoDTOById(cdiSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public CaddieInfoDTO createCaddieInfo(@RequestBody CaddieInfoDTO caddieInfoDTO) {
		return caddieInfoService.createCaddieInfo(caddieInfoDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{cdiSeq}")
	public CaddieInfoDTO updateCaddieInfo(@PathVariable Long cdiSeq,
			@RequestBody CaddieInfoDTO updatedLogDTO) {
		return caddieInfoService.updateCaddieInfo(cdiSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{cdiSeq}")
	public void deleteCaddieInfo(@PathVariable Long cdiSeq) {
		caddieInfoService.deleteCaddieInfo(cdiSeq);
	}
}

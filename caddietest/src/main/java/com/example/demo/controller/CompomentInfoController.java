package com.example.demo.controller;

import com.example.demo.dto.CompomentInfoDTO;
import com.example.demo.service.CompomentInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/compoment-infos")
public class CompomentInfoController {

	private final CompomentInfoService compomentInfoService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<CompomentInfoDTO> getAllCompomentInfos() {
		return compomentInfoService.getAllCompomentInfoDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{ciSeq}")
	public CompomentInfoDTO getCompomentInfoById(@PathVariable Long ciSeq) {
		return compomentInfoService.getCompomentInfoDTOById(ciSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public CompomentInfoDTO createCompomentInfo(@RequestBody CompomentInfoDTO compomentInfoDTO) {
		return compomentInfoService.createCompomentInfo(compomentInfoDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{ciSeq}")
	public CompomentInfoDTO updateCompomentInfo(@PathVariable Long ciSeq,
			@RequestBody CompomentInfoDTO updatedLogDTO) {
		return compomentInfoService.updateCompomentInfo(ciSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{ciSeq}")
	public void deleteCompomentInfo(@PathVariable Long ciSeq) {
		compomentInfoService.deleteCompomentInfo(ciSeq);
	}
}

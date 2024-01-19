package com.example.demo.controller;

import com.example.demo.dto.HoleParMentDTO;
import com.example.demo.service.HoleParMentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/hole-par-ments")
public class HoleParMentController {

	private final HoleParMentService holeParMentService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<HoleParMentDTO> getAllHoleParMents() {
		return holeParMentService.getAllHoleParMentDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{hpmSeq}")
	public HoleParMentDTO getHoleParMentById(@PathVariable Long hpmSeq) {
		return holeParMentService.getHoleParMentDTOById(hpmSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public HoleParMentDTO createHoleParMent(@RequestBody HoleParMentDTO holeParMentDTO) {
		return holeParMentService.createHoleParMent(holeParMentDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{hpmSeq}")
	public HoleParMentDTO updateHoleParMent(@PathVariable Long hpmSeq,
			@RequestBody HoleParMentDTO updatedLogDTO) {
		return holeParMentService.updateHoleParMent(hpmSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{hpmSeq}")
	public void deleteHoleParMent(@PathVariable Long hpmSeq) {
		holeParMentService.deleteHoleParMent(hpmSeq);
	}
}

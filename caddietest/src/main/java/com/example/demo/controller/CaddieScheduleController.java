package com.example.demo.controller;

import com.example.demo.dto.CaddieScheduleDTO;
import com.example.demo.service.CaddieScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/caddie-schedules")
public class CaddieScheduleController {

	private final CaddieScheduleService caddieScheduleService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<CaddieScheduleDTO> getAllCaddieSchedules() {
		return caddieScheduleService.getAllCaddieScheduleDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{csSeq}")
	public CaddieScheduleDTO getCaddieScheduleById(@PathVariable Long csSeq) {
		return caddieScheduleService.getCaddieScheduleDTOById(csSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public CaddieScheduleDTO createCaddieSchedule(@RequestBody CaddieScheduleDTO caddieScheduleDTO) {
		return caddieScheduleService.createCaddieSchedule(caddieScheduleDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{csSeq}")
	public CaddieScheduleDTO updateCaddieSchedule(@PathVariable Long csSeq,
			@RequestBody CaddieScheduleDTO updatedLogDTO) {
		return caddieScheduleService.updateCaddieSchedule(csSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{csSeq}")
	public void deleteCaddieSchedule(@PathVariable Long csSeq) {
		caddieScheduleService.deleteCaddieSchedule(csSeq);
	}
}

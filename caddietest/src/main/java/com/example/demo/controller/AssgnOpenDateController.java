package com.example.demo.controller;

import com.example.demo.dto.AssgnOpenDateDTO;
import com.example.demo.service.AssgnOpenDateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/assgn-open-dates")
public class AssgnOpenDateController {

	private final AssgnOpenDateService assgnOpenDateService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<AssgnOpenDateDTO> getAllAssgnOpenDates() {
		return assgnOpenDateService.getAllAssgnOpenDateDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{aodSeq}")
	public AssgnOpenDateDTO getAssgnOpenDateById(@PathVariable Long aodSeq) {
		return assgnOpenDateService.getAssgnOpenDateDTOById(aodSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public AssgnOpenDateDTO createAssgnOpenDate(@RequestBody AssgnOpenDateDTO assgnOpenDateDTO) {
		return assgnOpenDateService.createAssgnOpenDate(assgnOpenDateDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{aodSeq}")
	public AssgnOpenDateDTO updateAssgnOpenDate(@PathVariable Long aodSeq,
			@RequestBody AssgnOpenDateDTO updatedLogDTO) {
		return assgnOpenDateService.updateAssgnOpenDate(aodSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{aodSeq}")
	public void deleteAssgnOpenDate(@PathVariable Long aodSeq) {
		assgnOpenDateService.deleteAssgnOpenDate(aodSeq);
	}
}

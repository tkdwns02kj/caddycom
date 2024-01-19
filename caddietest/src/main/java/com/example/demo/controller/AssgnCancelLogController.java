package com.example.demo.controller;

import com.example.demo.dto.AssgnCancelLogDTO;
import com.example.demo.service.AssgnCancelLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/assgn-cancel-logs")
public class AssgnCancelLogController {

	private final AssgnCancelLogService assgnCancelLogService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<AssgnCancelLogDTO> getAllAssgnCancelLogs() {
		return assgnCancelLogService.getAllAssgnCancelLogDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{aclSeq}")
	public AssgnCancelLogDTO getAssgnCancelLogById(@PathVariable Long aclSeq) {
		return assgnCancelLogService.getAssgnCancelLogDTOById(aclSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public AssgnCancelLogDTO createAssgnCancelLog(@RequestBody AssgnCancelLogDTO assgnCancelLogDTO) {
		return assgnCancelLogService.createAssgnCancelLog(assgnCancelLogDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{aclSeq}")
	public AssgnCancelLogDTO updateAssgnCancelLog(@PathVariable Long aclSeq,
			@RequestBody AssgnCancelLogDTO updatedLogDTO) {
		return assgnCancelLogService.updateAssgnCancelLog(aclSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{aclSeq}")
	public void deleteAssgnCancelLog(@PathVariable Long aclSeq) {
		assgnCancelLogService.deleteAssgnCancelLog(aclSeq);
	}
}

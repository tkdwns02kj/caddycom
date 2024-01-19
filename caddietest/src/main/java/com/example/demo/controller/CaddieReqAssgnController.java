package com.example.demo.controller;

import com.example.demo.dto.CaddieReqAssgnDTO;
import com.example.demo.service.CaddieReqAssgnService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/caddie-req-assgns")
public class CaddieReqAssgnController {

	private final CaddieReqAssgnService caddieReqAssgnService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<CaddieReqAssgnDTO> getAllCaddieReqAssgns() {
		return caddieReqAssgnService.getAllCaddieReqAssgnDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{craSeq}")
	public CaddieReqAssgnDTO getCaddieReqAssgnById(@PathVariable Long craSeq) {
		return caddieReqAssgnService.getCaddieReqAssgnDTOById(craSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public CaddieReqAssgnDTO createCaddieReqAssgn(@RequestBody CaddieReqAssgnDTO caddieReqAssgnDTO) {
		return caddieReqAssgnService.createCaddieReqAssgn(caddieReqAssgnDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{craSeq}")
	public CaddieReqAssgnDTO updateCaddieReqAssgn(@PathVariable Long craSeq,
			@RequestBody CaddieReqAssgnDTO updatedLogDTO) {
		return caddieReqAssgnService.updateCaddieReqAssgn(craSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{craSeq}")
	public void deleteCaddieReqAssgn(@PathVariable Long craSeq) {
		caddieReqAssgnService.deleteCaddieReqAssgn(craSeq);
	}
}

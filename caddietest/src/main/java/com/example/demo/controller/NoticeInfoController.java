package com.example.demo.controller;

import com.example.demo.dto.NoticeInfoDTO;
import com.example.demo.service.NoticeInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/notice-infos")
public class NoticeInfoController {

	private final NoticeInfoService noticeInfoService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<NoticeInfoDTO> getAllNoticeInfos() {
		return noticeInfoService.getAllNoticeInfoDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{niSeq}")
	public NoticeInfoDTO getNoticeInfoById(@PathVariable Long niSeq) {
		return noticeInfoService.getNoticeInfoDTOById(niSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public NoticeInfoDTO createNoticeInfo(@RequestBody NoticeInfoDTO noticeInfoDTO) {
		return noticeInfoService.createNoticeInfo(noticeInfoDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{niSeq}")
	public NoticeInfoDTO updateNoticeInfo(@PathVariable Long niSeq,
			@RequestBody NoticeInfoDTO updatedLogDTO) {
		return noticeInfoService.updateNoticeInfo(niSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{niSeq}")
	public void deleteNoticeInfo(@PathVariable Long niSeq) {
		noticeInfoService.deleteNoticeInfo(niSeq);
	}
}

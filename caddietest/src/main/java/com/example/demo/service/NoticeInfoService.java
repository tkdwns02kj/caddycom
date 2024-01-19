package com.example.demo.service;

import com.example.demo.dto.NoticeInfoDTO;
import com.example.demo.entity.NoticeInfo;
import com.example.demo.repository.NoticeInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NoticeInfoService {

	private final NoticeInfoRepository noticeInfoRepository;

	/**
	 * 모든 공지사항 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<NoticeInfoDTO> getAllNoticeInfoDTOs() {
		List<NoticeInfo> noticeInfos = noticeInfoRepository.findAll();
		return noticeInfos.stream().map(NoticeInfoDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 공지사항 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public NoticeInfoDTO getNoticeInfoDTOById(Long niSeq) {
		return noticeInfoRepository.findById(niSeq).map(NoticeInfoDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 공지사항 정보 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public NoticeInfoDTO createNoticeInfo(NoticeInfoDTO noticeInfoDTO) {
		NoticeInfo noticeInfo = NoticeInfoDTO.toEntity(noticeInfoDTO);
		NoticeInfo savedLog = noticeInfoRepository.save(noticeInfo);
		return NoticeInfoDTO.toDto(savedLog);
	}

	/**
	 * 특정 공지사항 정보 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public NoticeInfoDTO updateNoticeInfo(Long niSeq, NoticeInfoDTO updatedLogDTO) {
		return noticeInfoRepository.findById(niSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			NoticeInfo updatedLog = noticeInfoRepository.save(existingLog);
			return NoticeInfoDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 공지사항 정보 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteNoticeInfo(Long niSeq) {
		noticeInfoRepository.deleteById(niSeq);
	}
}

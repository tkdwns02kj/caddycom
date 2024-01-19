package com.example.demo.service;

import com.example.demo.dto.AssgnCancelLogDTO;
import com.example.demo.entity.AssgnCancelLog;
import com.example.demo.repository.AssgnCancelLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AssgnCancelLogService {

	private final AssgnCancelLogRepository assgnCancelLogRepository;

	/**
	 * 모든 배정 취소 로그를 가져오는 메서드
	 */
	@Transactional
	public List<AssgnCancelLogDTO> getAllAssgnCancelLogDTOs() {
		List<AssgnCancelLog> assgnCancelLogs = assgnCancelLogRepository.findAll();
		return assgnCancelLogs.stream().map(AssgnCancelLogDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 메서드
	 */
	@Transactional
	public AssgnCancelLogDTO getAssgnCancelLogDTOById(Long aclSeq) {
		return assgnCancelLogRepository.findById(aclSeq).map(AssgnCancelLogDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 메서드
	 */
	@Transactional
	public AssgnCancelLogDTO createAssgnCancelLog(AssgnCancelLogDTO assgnCancelLogDTO) {
		AssgnCancelLog assgnCancelLog = AssgnCancelLogDTO.toEntity(assgnCancelLogDTO);
		AssgnCancelLog savedLog = assgnCancelLogRepository.save(assgnCancelLog);
		return AssgnCancelLogDTO.toDto(savedLog);
	}

	/**
	 * 특정 배정 취소 로그를 업데이트하는 메서드
	 */
	@Transactional
	public AssgnCancelLogDTO updateAssgnCancelLog(Long aclSeq, AssgnCancelLogDTO updatedLogDTO) {
		return assgnCancelLogRepository.findById(aclSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			AssgnCancelLog updatedLog = assgnCancelLogRepository.save(existingLog);
			return AssgnCancelLogDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 메서드
	 */
	@Transactional
	public void deleteAssgnCancelLog(Long aclSeq) {
		assgnCancelLogRepository.deleteById(aclSeq);
	}
}

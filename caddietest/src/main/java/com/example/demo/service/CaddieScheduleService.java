package com.example.demo.service;

import com.example.demo.dto.CaddieScheduleDTO;
import com.example.demo.entity.CaddieSchedule;
import com.example.demo.repository.CaddieScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CaddieScheduleService {

	private final CaddieScheduleRepository caddieScheduleRepository;

	/**
	 * 모든 캐디 스케줄 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<CaddieScheduleDTO> getAllCaddieScheduleDTOs() {
		List<CaddieSchedule> caddieSchedules = caddieScheduleRepository.findAll();
		return caddieSchedules.stream().map(CaddieScheduleDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 캐디 스케줄 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public CaddieScheduleDTO getCaddieScheduleDTOById(Long csSeq) {
		return caddieScheduleRepository.findById(csSeq).map(CaddieScheduleDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 캐디 스케줄 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public CaddieScheduleDTO createCaddieSchedule(CaddieScheduleDTO caddieScheduleDTO) {
		CaddieSchedule caddieSchedule = CaddieScheduleDTO.toEntity(caddieScheduleDTO);
		CaddieSchedule savedLog = caddieScheduleRepository.save(caddieSchedule);
		return CaddieScheduleDTO.toDto(savedLog);
	}

	/**
	 * 특정 캐디 스케줄 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public CaddieScheduleDTO updateCaddieSchedule(Long csSeq, CaddieScheduleDTO updatedLogDTO) {
		return caddieScheduleRepository.findById(csSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			CaddieSchedule updatedLog = caddieScheduleRepository.save(existingLog);
			return CaddieScheduleDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 캐디 스케줄 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteCaddieSchedule(Long csSeq) {
		caddieScheduleRepository.deleteById(csSeq);
	}
}

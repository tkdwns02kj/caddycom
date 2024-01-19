// AssgnOpenDateService.java
package com.example.demo.service;

import com.example.demo.dto.AssgnOpenDateDTO;
import com.example.demo.entity.AssgnOpenDate;
import com.example.demo.repository.AssgnOpenDateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AssgnOpenDateService {

	private final AssgnOpenDateRepository assgnOpenDateRepository;

	/**
	 * 모든 배정 리스트 오픈를 가져오는 메서드
	 */
	@Transactional
	public List<AssgnOpenDateDTO> getAllAssgnOpenDateDTOs() {
		List<AssgnOpenDate> assgnOpenDates = assgnOpenDateRepository.findAll();
		return assgnOpenDates.stream().map(AssgnOpenDateDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 배정 리스트 오픈를 가져오는 메서드
	 */
	@Transactional
	public AssgnOpenDateDTO getAssgnOpenDateDTOById(Long aodSeq) {
		return assgnOpenDateRepository.findById(aodSeq).map(AssgnOpenDateDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 배정 리스트 오픈를 생성하는 메서드
	 */
	@Transactional
	public AssgnOpenDateDTO createAssgnOpenDate(AssgnOpenDateDTO assgnOpenDateDTO) {
		AssgnOpenDate assgnOpenDate = AssgnOpenDateDTO.toEntity(assgnOpenDateDTO);
		AssgnOpenDate savedLog = assgnOpenDateRepository.save(assgnOpenDate);
		return AssgnOpenDateDTO.toDto(savedLog);
	}

	/**
	 * 특정 배정 리스트 오픈를 업데이트하는 메서드
	 */
	@Transactional
	public AssgnOpenDateDTO updateAssgnOpenDate(Long aodSeq, AssgnOpenDateDTO updatedLogDTO) {
		return assgnOpenDateRepository.findById(aodSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			AssgnOpenDate updatedLog = assgnOpenDateRepository.save(existingLog);
			return AssgnOpenDateDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 배정 리스트 오픈를 삭제하는 메서드
	 */
	@Transactional
	public void deleteAssgnOpenDate(Long aodSeq) {
		assgnOpenDateRepository.deleteById(aodSeq);
	}

}

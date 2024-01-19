package com.example.demo.service;

import com.example.demo.dto.HoleParMentDTO;
import com.example.demo.entity.HoleParMent;
import com.example.demo.repository.HoleParMentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HoleParMentService {

	private final HoleParMentRepository holeParMentRepository;

	/**
	 * 모든 홀파 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<HoleParMentDTO> getAllHoleParMentDTOs() {
		List<HoleParMent> holeParMents = holeParMentRepository.findAll();
		return holeParMents.stream().map(HoleParMentDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 홀파 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public HoleParMentDTO getHoleParMentDTOById(Long hpmSeq) {
		return holeParMentRepository.findById(hpmSeq).map(HoleParMentDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 홀파 정보 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public HoleParMentDTO createHoleParMent(HoleParMentDTO holeParMentDTO) {
		HoleParMent holeParMent = HoleParMentDTO.toEntity(holeParMentDTO);
		HoleParMent savedLog = holeParMentRepository.save(holeParMent);
		return HoleParMentDTO.toDto(savedLog);
	}

	/**
	 * 특정 홀파 정보 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public HoleParMentDTO updateHoleParMent(Long hpmSeq, HoleParMentDTO updatedLogDTO) {
		return holeParMentRepository.findById(hpmSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			HoleParMent updatedLog = holeParMentRepository.save(existingLog);
			return HoleParMentDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 홀파 정보 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteHoleParMent(Long hpmSeq) {
		holeParMentRepository.deleteById(hpmSeq);
	}
}

package com.example.demo.service;

import com.example.demo.dto.HoleParInfoDTO;
import com.example.demo.entity.HoleParInfo;
import com.example.demo.repository.HoleParInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HoleParInfoService {

	private final HoleParInfoRepository holeParInfoRepository;

	/**
	 * 모든 홀 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<HoleParInfoDTO> getAllHoleParInfoDTOs() {
		List<HoleParInfo> holeParInfos = holeParInfoRepository.findAll();
		return holeParInfos.stream().map(HoleParInfoDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 홀 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public HoleParInfoDTO getHoleParInfoDTOById(Long hpiSeq) {
		return holeParInfoRepository.findById(hpiSeq).map(HoleParInfoDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 홀 정보 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public HoleParInfoDTO createHoleParInfo(HoleParInfoDTO holeParInfoDTO) {
		HoleParInfo holeParInfo = HoleParInfoDTO.toEntity(holeParInfoDTO);
		HoleParInfo savedLog = holeParInfoRepository.save(holeParInfo);
		return HoleParInfoDTO.toDto(savedLog);
	}

	/**
	 * 특정 홀 정보 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public HoleParInfoDTO updateHoleParInfo(Long hpiSeq, HoleParInfoDTO updatedLogDTO) {
		return holeParInfoRepository.findById(hpiSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			HoleParInfo updatedLog = holeParInfoRepository.save(existingLog);
			return HoleParInfoDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 홀 정보 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteHoleParInfo(Long hpiSeq) {
		holeParInfoRepository.deleteById(hpiSeq);
	}
}

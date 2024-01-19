package com.example.demo.service;

import com.example.demo.dto.TeeInfoDTO;
import com.example.demo.entity.TeeInfo;
import com.example.demo.repository.TeeInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeeInfoService {

	private final TeeInfoRepository teeInfoRepository;

	/**
	 * 모든 TEE 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<TeeInfoDTO> getAllTeeInfoDTOs() {
		List<TeeInfo> teeInfos = teeInfoRepository.findAll();
		return teeInfos.stream().map(TeeInfoDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 TEE 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public TeeInfoDTO getTeeInfoDTOById(Long tiSeq) {
		return teeInfoRepository.findById(tiSeq).map(TeeInfoDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 TEE 정보 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public TeeInfoDTO createTeeInfo(TeeInfoDTO teeInfoDTO) {
		TeeInfo teeInfo = TeeInfoDTO.toEntity(teeInfoDTO);
		TeeInfo savedLog = teeInfoRepository.save(teeInfo);
		return TeeInfoDTO.toDto(savedLog);
	}

	/**
	 * 특정 TEE 정보 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public TeeInfoDTO updateTeeInfo(Long tiSeq, TeeInfoDTO updatedLogDTO) {
		return teeInfoRepository.findById(tiSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			TeeInfo updatedLog = teeInfoRepository.save(existingLog);
			return TeeInfoDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 TEE 정보 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteTeeInfo(Long tiSeq) {
		teeInfoRepository.deleteById(tiSeq);
	}
}

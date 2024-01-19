package com.example.demo.service;

import com.example.demo.dto.CompomentInfoDTO;
import com.example.demo.entity.CompomentInfo;
import com.example.demo.repository.CompomentInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompomentInfoService {

	private final CompomentInfoRepository compomentInfoRepository;

	/**
	 * 모든 구성 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<CompomentInfoDTO> getAllCompomentInfoDTOs() {
		List<CompomentInfo> compomentInfos = compomentInfoRepository.findAll();
		return compomentInfos.stream().map(CompomentInfoDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 구성 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public CompomentInfoDTO getCompomentInfoDTOById(Long ciSeq) {
		return compomentInfoRepository.findById(ciSeq).map(CompomentInfoDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 구성 정보 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public CompomentInfoDTO createCompomentInfo(CompomentInfoDTO compomentInfoDTO) {
		CompomentInfo compomentInfo = CompomentInfoDTO.toEntity(compomentInfoDTO);
		CompomentInfo savedLog = compomentInfoRepository.save(compomentInfo);
		return CompomentInfoDTO.toDto(savedLog);
	}

	/**
	 * 특정 구성 정보 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public CompomentInfoDTO updateCompomentInfo(Long ciSeq, CompomentInfoDTO updatedLogDTO) {
		return compomentInfoRepository.findById(ciSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			CompomentInfo updatedLog = compomentInfoRepository.save(existingLog);
			return CompomentInfoDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 구성 정보 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteCompomentInfo(Long ciSeq) {
		compomentInfoRepository.deleteById(ciSeq);
	}
}

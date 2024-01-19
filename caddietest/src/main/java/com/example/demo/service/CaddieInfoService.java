package com.example.demo.service;

import com.example.demo.dto.CaddieInfoDTO;
import com.example.demo.entity.CaddieInfo;
import com.example.demo.repository.CaddieInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CaddieInfoService {

	private final CaddieInfoRepository caddieInfoRepository;

	/**
	 * 모든 캐디 정보 시퀸스를 가져오는 메서드
	 */
	@Transactional
	public List<CaddieInfoDTO> getAllCaddieInfoDTOs() {
		List<CaddieInfo> caddieInfos = caddieInfoRepository.findAll();
		return caddieInfos.stream().map(CaddieInfoDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 캐디 정보 시퀸스를 가져오는 메서드
	 */
	@Transactional
	public CaddieInfoDTO getCaddieInfoDTOById(Long cdiSeq) {
		return caddieInfoRepository.findById(cdiSeq).map(CaddieInfoDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 캐디 정보 시퀸스를 생성하는 메서드
	 */
	@Transactional
	public CaddieInfoDTO createCaddieInfo(CaddieInfoDTO caddieInfoDTO) {
		CaddieInfo caddieInfo = CaddieInfoDTO.toEntity(caddieInfoDTO);
		CaddieInfo savedLog = caddieInfoRepository.save(caddieInfo);
		return CaddieInfoDTO.toDto(savedLog);
	}

	/**
	 * 특정 캐디 정보 시퀸스를 업데이트하는 메서드
	 */
	@Transactional
	public CaddieInfoDTO updateCaddieInfo(Long cdiSeq, CaddieInfoDTO updatedLogDTO) {
		return caddieInfoRepository.findById(cdiSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			CaddieInfo updatedLog = caddieInfoRepository.save(existingLog);
			return CaddieInfoDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 캐디 정보 시퀸스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteCaddieInfo(Long cdiSeq) {
		caddieInfoRepository.deleteById(cdiSeq);
	}
}

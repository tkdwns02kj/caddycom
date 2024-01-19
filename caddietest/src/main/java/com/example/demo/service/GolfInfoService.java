package com.example.demo.service;

import com.example.demo.dto.GolfInfoDTO;
import com.example.demo.entity.GolfInfo;
import com.example.demo.repository.GolfInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GolfInfoService {

	private final GolfInfoRepository golfInfoRepository;

	/**
	 * 모든 골프장 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<GolfInfoDTO> getAllGolfInfoDTOs() {
		List<GolfInfo> golfInfos = golfInfoRepository.findAll();
		return golfInfos.stream().map(GolfInfoDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 골프장 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public GolfInfoDTO getGolfInfoDTOById(Long giSeq) {
		return golfInfoRepository.findById(giSeq).map(GolfInfoDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 골프장 정보 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public GolfInfoDTO createGolfInfo(GolfInfoDTO golfInfoDTO) {
		GolfInfo golfInfo = GolfInfoDTO.toEntity(golfInfoDTO);
		GolfInfo savedLog = golfInfoRepository.save(golfInfo);
		return GolfInfoDTO.toDto(savedLog);
	}

	/**
	 * 특정 골프장 정보 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public GolfInfoDTO updateGolfInfo(Long giSeq, GolfInfoDTO updatedLogDTO) {
		return golfInfoRepository.findById(giSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			GolfInfo updatedLog = golfInfoRepository.save(existingLog);
			return GolfInfoDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 골프장 정보 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteGolfInfo(Long giSeq) {
		golfInfoRepository.deleteById(giSeq);
	}
}

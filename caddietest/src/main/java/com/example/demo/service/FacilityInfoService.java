package com.example.demo.service;

import com.example.demo.dto.FacilityInfoDTO;
import com.example.demo.entity.FacilityInfo;
import com.example.demo.repository.FacilityInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FacilityInfoService {

	private final FacilityInfoRepository facilityInfoRepository;

	/**
	 * 모든 시설 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<FacilityInfoDTO> getAllFacilityInfoDTOs() {
		List<FacilityInfo> facilityInfos = facilityInfoRepository.findAll();
		return facilityInfos.stream().map(FacilityInfoDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 시설 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public FacilityInfoDTO getFacilityInfoDTOById(Long fiSeq) {
		return facilityInfoRepository.findById(fiSeq).map(FacilityInfoDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 시설 정보 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public FacilityInfoDTO createFacilityInfo(FacilityInfoDTO facilityInfoDTO) {
		FacilityInfo facilityInfo = FacilityInfoDTO.toEntity(facilityInfoDTO);
		FacilityInfo savedLog = facilityInfoRepository.save(facilityInfo);
		return FacilityInfoDTO.toDto(savedLog);
	}

	/**
	 * 특정 시설 정보 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public FacilityInfoDTO updateFacilityInfo(Long fiSeq, FacilityInfoDTO updatedLogDTO) {
		return facilityInfoRepository.findById(fiSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			FacilityInfo updatedLog = facilityInfoRepository.save(existingLog);
			return FacilityInfoDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 시설 정보 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteFacilityInfo(Long fiSeq) {
		facilityInfoRepository.deleteById(fiSeq);
	}
}

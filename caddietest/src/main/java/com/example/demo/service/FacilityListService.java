package com.example.demo.service;

import com.example.demo.dto.FacilityListDTO;
import com.example.demo.entity.FacilityList;
import com.example.demo.repository.FacilityListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FacilityListService {

	private final FacilityListRepository facilityListRepository;

	/**
	 * 모든 시설 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<FacilityListDTO> getAllFacilityListDTOs() {
		List<FacilityList> facilityLists = facilityListRepository.findAll();
		return facilityLists.stream().map(FacilityListDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 시설 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public FacilityListDTO getFacilityListDTOById(Long flSeq) {
		return facilityListRepository.findById(flSeq).map(FacilityListDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 시설 정보 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public FacilityListDTO createFacilityList(FacilityListDTO facilityListDTO) {
		FacilityList facilityList = FacilityListDTO.toEntity(facilityListDTO);
		FacilityList savedLog = facilityListRepository.save(facilityList);
		return FacilityListDTO.toDto(savedLog);
	}

	/**
	 * 특정 시설 정보 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public FacilityListDTO updateFacilityList(Long flSeq, FacilityListDTO updatedLogDTO) {
		return facilityListRepository.findById(flSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			FacilityList updatedLog = facilityListRepository.save(existingLog);
			return FacilityListDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 시설 정보 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteFacilityList(Long flSeq) {
		facilityListRepository.deleteById(flSeq);
	}
}

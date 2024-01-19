package com.example.demo.service;

import com.example.demo.dto.CaddieReqAssgnDTO;
import com.example.demo.entity.CaddieReqAssgn;
import com.example.demo.repository.CaddieReqAssgnRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CaddieReqAssgnService {

	private final CaddieReqAssgnRepository caddieReqAssgnRepository;

	/**
	 * 모든 캐디 배정 요청 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<CaddieReqAssgnDTO> getAllCaddieReqAssgnDTOs() {
		List<CaddieReqAssgn> caddieReqAssgns = caddieReqAssgnRepository.findAll();
		return caddieReqAssgns.stream().map(CaddieReqAssgnDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 캐디 배정 요청 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public CaddieReqAssgnDTO getCaddieReqAssgnDTOById(Long craSeq) {
		return caddieReqAssgnRepository.findById(craSeq).map(CaddieReqAssgnDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 캐디 배정 요청 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public CaddieReqAssgnDTO createCaddieReqAssgn(CaddieReqAssgnDTO caddieReqAssgnDTO) {
		CaddieReqAssgn caddieReqAssgn = CaddieReqAssgnDTO.toEntity(caddieReqAssgnDTO);
		CaddieReqAssgn savedLog = caddieReqAssgnRepository.save(caddieReqAssgn);
		return CaddieReqAssgnDTO.toDto(savedLog);
	}

	/**
	 * 특정 캐디 배정 요청 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public CaddieReqAssgnDTO updateCaddieReqAssgn(Long craSeq, CaddieReqAssgnDTO updatedLogDTO) {
		return caddieReqAssgnRepository.findById(craSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			CaddieReqAssgn updatedLog = caddieReqAssgnRepository.save(existingLog);
			return CaddieReqAssgnDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 캐디 배정 요청 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteCaddieReqAssgn(Long craSeq) {
		caddieReqAssgnRepository.deleteById(craSeq);
	}
}

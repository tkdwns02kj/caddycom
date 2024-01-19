package com.example.demo.dto;

import com.example.demo.entity.TeeInfo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeeInfoDTO {

	private Long tiSeq; // TEE 정보 시퀀스
	private String tiTeeId; // 티 번호
	private Long hpiHoleId; // 홀 번호(ID)
	private Long hpiParId; // 파 번호(ID)
	private String tiTeeName; // TEE 이름
	private String tiM; // M 미터
	private String tiYard; // YARD 야드
	private Long tiMSubtotal; // M 소계
	private Long tiYardSubtotal; // YARD 소계
	private Long tiMTotal; // M 합계
	private Long tiYardTotal; // YARD 합계
	private Long hpiParSubtotal; // HPI 파 소계
	private Long hpiParTotal; // HPI 파 합계

	public static TeeInfoDTO toDto(TeeInfo Ti) {
		TeeInfoDTO teeInfoDTO = new TeeInfoDTO();
		teeInfoDTO.setTiSeq(Ti.getTiSeq());
		teeInfoDTO.setTiTeeId(Ti.getTiTeeId());
		teeInfoDTO.setHpiHoleId(Ti.getHpiHoleId());
		teeInfoDTO.setHpiParId(Ti.getHpiParId());
		teeInfoDTO.setTiTeeName(Ti.getTiTeeName());
		teeInfoDTO.setTiM(Ti.getTiM());
		teeInfoDTO.setTiYard(Ti.getTiYard());
		teeInfoDTO.setTiMSubtotal(Ti.getTiMSubtotal());
		teeInfoDTO.setTiYardSubtotal(Ti.getTiYardSubtotal());
		teeInfoDTO.setTiMTotal(Ti.getTiMTotal());
		teeInfoDTO.setTiYardTotal(Ti.getTiYardTotal());
		teeInfoDTO.setHpiParSubtotal(Ti.getHpiParSubtotal());
		teeInfoDTO.setHpiParTotal(Ti.getHpiParTotal());
		return teeInfoDTO;
	}

	public static TeeInfo toEntity(TeeInfoDTO dto) {
		TeeInfo entity = new TeeInfo();
		entity.setTiSeq(dto.getTiSeq());
		entity.setTiTeeId(dto.getTiTeeId());
		entity.setHpiHoleId(dto.getHpiHoleId());
		entity.setHpiParId(dto.getHpiParId());
		entity.setTiTeeName(dto.getTiTeeName());
		entity.setTiM(dto.getTiM());
		entity.setTiYard(dto.getTiYard());
		entity.setTiMSubtotal(dto.getTiMSubtotal());
		entity.setTiYardSubtotal(dto.getTiYardSubtotal());
		entity.setTiMTotal(dto.getTiMTotal());
		entity.setTiYardTotal(dto.getTiYardTotal());
		entity.setHpiParSubtotal(dto.getHpiParSubtotal());
		entity.setHpiParTotal(dto.getHpiParTotal());
		return entity;
	}

	public void updateEntity(TeeInfo entity) {
		entity.setTiTeeId(this.tiTeeId);
		entity.setHpiHoleId(this.hpiHoleId);
		entity.setHpiParId(this.hpiParId);
		entity.setTiTeeName(this.tiTeeName);
		entity.setTiM(this.tiM);
		entity.setTiYard(this.tiYard);
		entity.setTiMSubtotal(this.tiMSubtotal);
		entity.setTiYardSubtotal(this.tiYardSubtotal);
		entity.setTiMTotal(this.tiMTotal);
		entity.setTiYardTotal(this.tiYardTotal);
		entity.setHpiParSubtotal(this.hpiParSubtotal);
		entity.setHpiParTotal(this.hpiParTotal);
	}
}

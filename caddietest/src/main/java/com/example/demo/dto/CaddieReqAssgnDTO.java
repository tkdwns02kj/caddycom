package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.CaddieReqAssgn;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CaddieReqAssgnDTO {

	private Long craSeq; // 캐디 배정 요청 시퀀스
	private Long giId;
	private String craDate; // 예약일자
	private String craTime; // 예약시간
	private String craCrse; // 골프장 코스
	private String craAssgnType; // 캐디 타입 (하우스캐디:H, 외부캐디:O)
	private String craGenderMf; // 성별 (남자:M, 여자:F)
	private String craAbilityType; // 경력
	private String craApplyUiId; // 캐디배정 지원자
	private String craAssgnYn; // 캐디배정 상태 (완료:Y,진행:N)
	private Date inptDttm; // 생성일시
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private String wrkIp; // IP
	private String craReservationYn; // 고객 예약 유무
	private Long craActiveHole; // 라운드 수

	public static CaddieReqAssgnDTO toDto(CaddieReqAssgn Cra) {
		CaddieReqAssgnDTO caddieReqAssgnDTO = new CaddieReqAssgnDTO();
		caddieReqAssgnDTO.setCraSeq(Cra.getCraSeq());
		caddieReqAssgnDTO.setGiId(Cra.getGiId());
		caddieReqAssgnDTO.setCraDate(Cra.getCraDate());
		caddieReqAssgnDTO.setCraTime(Cra.getCraTime());
		caddieReqAssgnDTO.setCraCrse(Cra.getCraCrse());
		caddieReqAssgnDTO.setCraAssgnType(Cra.getCraAssgnType());
		caddieReqAssgnDTO.setCraGenderMf(Cra.getCraGenderMf());
		caddieReqAssgnDTO.setCraAbilityType(Cra.getCraAbilityType());
		caddieReqAssgnDTO.setCraApplyUiId(Cra.getCraApplyUiId());
		caddieReqAssgnDTO.setCraAssgnYn(Cra.getCraAssgnYn());
		caddieReqAssgnDTO.setInptDttm(Cra.getInptDttm());
		caddieReqAssgnDTO.setInptNbr(Cra.getInptNbr());
		caddieReqAssgnDTO.setUpdtDttm(Cra.getUpdtDttm());
		caddieReqAssgnDTO.setUpdtNbr(Cra.getUpdtNbr());
		caddieReqAssgnDTO.setWrkIp(Cra.getWrkIp());
		caddieReqAssgnDTO.setCraReservationYn(Cra.getCraReservationYn());
		caddieReqAssgnDTO.setCraActiveHole(Cra.getCraActiveHole());
		return caddieReqAssgnDTO;
	}

	public static CaddieReqAssgn toEntity(CaddieReqAssgnDTO dto) {
		CaddieReqAssgn entity = new CaddieReqAssgn();
		entity.setCraSeq(dto.getCraSeq());
		entity.setGiId(dto.getGiId());
		entity.setCraDate(dto.getCraDate());
		entity.setCraTime(dto.getCraTime());
		entity.setCraCrse(dto.getCraCrse());
		entity.setCraAssgnType(dto.getCraAssgnType());
		entity.setCraGenderMf(dto.getCraGenderMf());
		entity.setCraAbilityType(dto.getCraAbilityType());
		entity.setCraApplyUiId(dto.getCraApplyUiId());
		entity.setCraAssgnYn(dto.getCraAssgnYn());
		entity.setInptDttm(dto.getInptDttm());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setWrkIp(dto.getWrkIp());
		entity.setCraReservationYn(dto.getCraReservationYn());
		entity.setCraActiveHole(dto.getCraActiveHole());
		return entity;
	}

	public void updateEntity(CaddieReqAssgn entity) {
		entity.setGiId(this.giId);
		entity.setCraDate(this.craDate);
		entity.setCraTime(this.craTime);
		entity.setCraCrse(this.craCrse);
		entity.setCraAssgnType(this.craAssgnType);
		entity.setCraGenderMf(this.craGenderMf);
		entity.setCraAbilityType(this.craAbilityType);
		entity.setCraApplyUiId(this.craApplyUiId);
		entity.setCraAssgnYn(this.craAssgnYn);
		entity.setUpdtDttm(new Date());
		entity.setUpdtNbr(this.updtNbr);
		entity.setWrkIp(this.wrkIp);
		entity.setCraReservationYn(this.craReservationYn);
		entity.setCraActiveHole(this.craActiveHole);
	}

}

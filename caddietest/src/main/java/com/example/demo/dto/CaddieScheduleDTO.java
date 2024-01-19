package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.CaddieSchedule;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CaddieScheduleDTO {

	private Long csSeq; // 캐디 스케줄 시퀀스
	private String uiId; // 유저 아이디
	private Long giId; // 골프장 아이디
	private Long craSeq; // 배정리스트 시퀀스
	private String csDate; // 스케줄 날짜
	private String csTime; // 스케줄 시간
	private String csCrse; // 스케줄 코스
	private String csReqGenderM; // 성별 (M:남성)
	private String csReqAbility;
	// 능력 (N:무관, A:신입, B:1~3년, C:4~6년, D:7~9년, E:10년이상, T:레슨가능)
	private String csRound; // 홀 수
	private String csStateCe; // 상태 (C:확정, E:종료)
	private String csCaddieFee; // 캐디피
	private Date inptDttm; // 생성일시
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private String wrkIp; // IP
	private String csCompoment; // 구성
	private String csRoleLevel; // 등급
	private String csRegion; // 지역
	private String csReqGenderF; // 성별 (M:여성)

	public static CaddieScheduleDTO toDto(CaddieSchedule Cs) {
		CaddieScheduleDTO caddieScheduleDTO = new CaddieScheduleDTO();
		caddieScheduleDTO.setCsSeq(Cs.getCsSeq());
		caddieScheduleDTO.setUiId(Cs.getUiId());
		caddieScheduleDTO.setGiId(Cs.getGiId());
		caddieScheduleDTO.setCraSeq(Cs.getCraSeq());
		caddieScheduleDTO.setCsDate(Cs.getCsDate());
		caddieScheduleDTO.setCsTime(Cs.getCsTime());
		caddieScheduleDTO.setCsCrse(Cs.getCsCrse());
		caddieScheduleDTO.setCsReqGenderM(Cs.getCsReqGenderM());
		caddieScheduleDTO.setCsReqAbility(Cs.getCsReqAbility());
		caddieScheduleDTO.setCsRound(Cs.getCsRound());
		caddieScheduleDTO.setCsStateCe(Cs.getCsStateCe());
		caddieScheduleDTO.setCsCaddieFee(Cs.getCsCaddieFee());
		caddieScheduleDTO.setInptDttm(Cs.getInptDttm());
		caddieScheduleDTO.setInptNbr(Cs.getInptNbr());
		caddieScheduleDTO.setUpdtDttm(Cs.getUpdtDttm());
		caddieScheduleDTO.setUpdtNbr(Cs.getUpdtNbr());
		caddieScheduleDTO.setWrkIp(Cs.getWrkIp());
		caddieScheduleDTO.setCsCompoment(Cs.getCsCompoment());
		caddieScheduleDTO.setCsRoleLevel(Cs.getCsRoleLevel());
		caddieScheduleDTO.setCsRegion(Cs.getCsRegion());
		caddieScheduleDTO.setCsReqGenderF(Cs.getCsReqGenderF());
		return caddieScheduleDTO;
	}

	public static CaddieSchedule toEntity(CaddieScheduleDTO dto) {
		CaddieSchedule entity = new CaddieSchedule();
		entity.setCsSeq(dto.getCsSeq());
		entity.setUiId(dto.getUiId());
		entity.setGiId(dto.getGiId());
		entity.setCraSeq(dto.getCraSeq());
		entity.setCsDate(dto.getCsDate());
		entity.setCsTime(dto.getCsTime());
		entity.setCsCrse(dto.getCsCrse());
		entity.setCsReqGenderM(dto.getCsReqGenderM());
		entity.setCsReqAbility(dto.getCsReqAbility());
		entity.setCsRound(dto.getCsRound());
		entity.setCsStateCe(dto.getCsStateCe());
		entity.setCsCaddieFee(dto.getCsCaddieFee());
		entity.setInptDttm(dto.getInptDttm());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setWrkIp(dto.getWrkIp());
		entity.setCsCompoment(dto.getCsCompoment());
		entity.setCsRoleLevel(dto.getCsRoleLevel());
		entity.setCsRegion(dto.getCsRegion());
		entity.setCsReqGenderF(dto.getCsReqGenderF());
		return entity;
	}

	public void updateEntity(CaddieSchedule entity) {
		entity.setUiId(this.uiId);
		entity.setGiId(this.giId);
		entity.setCraSeq(this.craSeq);
		entity.setCsDate(this.csDate);
		entity.setCsTime(this.csTime);
		entity.setCsCrse(this.csCrse);
		entity.setCsReqGenderM(this.csReqGenderM);
		entity.setCsReqAbility(this.csReqAbility);
		entity.setCsRound(this.csRound);
		entity.setCsStateCe(this.csStateCe);
		entity.setCsCaddieFee(this.csCaddieFee);
		entity.setUpdtDttm(new Date());
		entity.setUpdtNbr(this.updtNbr);
		entity.setWrkIp(this.wrkIp);
		entity.setCsCompoment(this.csCompoment);
		entity.setCsRoleLevel(this.csRoleLevel);
		entity.setCsRegion(this.csRegion);
		entity.setCsReqGenderF(this.csReqGenderF);
	}
}

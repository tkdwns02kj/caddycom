package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.HoleParInfo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HoleParInfoDTO {

	private Long hpiSeq; // 홀 정보 시퀀스
	private Long clCourseId; // 코스 아이디
	private Long hpiHoleId; // 홀 번호(ID)
	private String hpiGreen; // 그린 타입 (L-0, R-1)
	private Long hpiParId; // 파 번호(ID)
	private Long hpiHdcp; // 핸디캡
	private Long hpiM; // 티샷에서 홀까지 거리 (m)
	private Long hpiYard; // 블루 티샷에서 홀까지 야드 (y)
	private Date inptDttm; // 생성일시
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private String wrkIp; // IP

	public static HoleParInfoDTO toDto(HoleParInfo Hpi) {
		HoleParInfoDTO holeParInfoDTO = new HoleParInfoDTO();
		holeParInfoDTO.setHpiSeq(Hpi.getHpiSeq());
		holeParInfoDTO.setClCourseId(Hpi.getClCourseId());
		holeParInfoDTO.setHpiHoleId(Hpi.getHpiHoleId());
		holeParInfoDTO.setHpiGreen(Hpi.getHpiGreen());
		holeParInfoDTO.setHpiParId(Hpi.getHpiParId());
		holeParInfoDTO.setHpiHdcp(Hpi.getHpiHdcp());
		holeParInfoDTO.setHpiM(Hpi.getHpiM());
		holeParInfoDTO.setHpiYard(Hpi.getHpiYard());
		holeParInfoDTO.setInptDttm(Hpi.getInptDttm());
		holeParInfoDTO.setInptNbr(Hpi.getInptNbr());
		holeParInfoDTO.setUpdtDttm(Hpi.getUpdtDttm());
		holeParInfoDTO.setUpdtNbr(Hpi.getUpdtNbr());
		holeParInfoDTO.setWrkIp(Hpi.getWrkIp());
		return holeParInfoDTO;
	}

	public static HoleParInfo toEntity(HoleParInfoDTO dto) {
		HoleParInfo entity = new HoleParInfo();
		entity.setHpiSeq(dto.getHpiSeq());
		entity.setClCourseId(dto.getClCourseId());
		entity.setHpiHoleId(dto.getHpiHoleId());
		entity.setHpiGreen(dto.getHpiGreen());
		entity.setHpiParId(dto.getHpiParId());
		entity.setHpiHdcp(dto.getHpiHdcp());
		entity.setHpiM(dto.getHpiM());
		entity.setHpiYard(dto.getHpiYard());
		entity.setInptDttm(dto.getInptDttm());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setWrkIp(dto.getWrkIp());
		return entity;
	}

	public void updateEntity(HoleParInfo entity) {
		entity.setClCourseId(this.clCourseId);
		entity.setHpiHoleId(this.hpiHoleId);
		entity.setHpiGreen(this.hpiGreen);
		entity.setHpiParId(this.hpiParId);
		entity.setHpiHdcp(this.hpiHdcp);
		entity.setHpiM(this.hpiM);
		entity.setHpiYard(this.hpiYard);
		entity.setInptDttm(this.inptDttm);
		entity.setInptNbr(this.inptNbr);
		entity.setUpdtDttm(new Date());
		entity.setUpdtNbr(this.updtNbr);
		entity.setWrkIp(this.wrkIp);
	}
}

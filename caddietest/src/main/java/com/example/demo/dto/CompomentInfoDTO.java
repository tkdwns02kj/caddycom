package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.CompomentInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CompomentInfoDTO {

	private Long ciSeq; // 구성 정보 시퀀스
	private Long giId; // 골프장 코드 번호
	private Long ciCompomentId; // 구성 코드 번호
	private String ciCompomentName; // 구성 이름
	private Date inptDttm; // 생성일시
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private String wrkIp; // IP

	public static CompomentInfoDTO toDto(CompomentInfo Ci) {
		CompomentInfoDTO compomentInfoDTO = new CompomentInfoDTO();
		compomentInfoDTO.setCiSeq(Ci.getCiSeq());
		compomentInfoDTO.setGiId(Ci.getGiId());
		compomentInfoDTO.setCiCompomentId(Ci.getCiCompomentId());
		compomentInfoDTO.setCiCompomentName(Ci.getCiCompomentName());
		compomentInfoDTO.setInptDttm(Ci.getInptDttm());
		compomentInfoDTO.setInptNbr(Ci.getInptNbr());
		compomentInfoDTO.setUpdtDttm(Ci.getUpdtDttm());
		compomentInfoDTO.setUpdtNbr(Ci.getUpdtNbr());
		compomentInfoDTO.setWrkIp(Ci.getWrkIp());
		return compomentInfoDTO;
	}

	public static CompomentInfo toEntity(CompomentInfoDTO dto) {
		CompomentInfo entity = new CompomentInfo();
		entity.setCiSeq(dto.getCiSeq());
		entity.setGiId(dto.getGiId());
		entity.setCiCompomentId(dto.getCiCompomentId());
		entity.setCiCompomentName(dto.getCiCompomentName());
		entity.setInptDttm(dto.getInptDttm());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setWrkIp(dto.getWrkIp());
		return entity;
	}

	public void updateEntity(CompomentInfo entity) {
		entity.setGiId(this.giId);
		entity.setCiCompomentId(this.ciCompomentId);
		entity.setCiCompomentName(this.ciCompomentName);
		entity.setUpdtDttm(new Date());
		entity.setUpdtNbr(this.updtNbr);
		entity.setWrkIp(this.wrkIp);
	}
}
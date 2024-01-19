package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.FacilityList;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FacilityListDTO {

	private Long flSeq; // 시설 정보 시퀀스
	private Long giId; // 골프장 코드 번호
	private Long flId; // 시설 코드 번호
	private String flFacilityName; // 시설 이름
	private Date inptDttm; // 생성일시
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private String wrkIp; // IP
	private String flImg1; // 이미지
	private String flImg2; // 이미지
	private String flImg3; // 이미지
	private String flImg4; // 이미지
	private String flImg5; // 이미지

	public static FacilityListDTO toDto(FacilityList Fl) {
		FacilityListDTO facilityListDTO = new FacilityListDTO();
		facilityListDTO.setFlSeq(Fl.getFlSeq());
		facilityListDTO.setGiId(Fl.getGiId());
		facilityListDTO.setFlId(Fl.getFlId());
		facilityListDTO.setFlFacilityName(Fl.getFlFacilityName());
		facilityListDTO.setInptDttm(Fl.getInptDttm());
		facilityListDTO.setInptNbr(Fl.getInptNbr());
		facilityListDTO.setUpdtDttm(Fl.getUpdtDttm());
		facilityListDTO.setUpdtNbr(Fl.getUpdtNbr());
		facilityListDTO.setWrkIp(Fl.getWrkIp());
		facilityListDTO.setFlImg1(Fl.getFlImg1());
		facilityListDTO.setFlImg2(Fl.getFlImg2());
		facilityListDTO.setFlImg3(Fl.getFlImg3());
		facilityListDTO.setFlImg4(Fl.getFlImg4());
		facilityListDTO.setFlImg5(Fl.getFlImg5());
		return facilityListDTO;
	}

	public static FacilityList toEntity(FacilityListDTO dto) {
		FacilityList entity = new FacilityList();
		entity.setFlSeq(dto.getFlSeq());
		entity.setGiId(dto.getGiId());
		entity.setFlId(dto.getFlId());
		entity.setFlFacilityName(dto.getFlFacilityName());
		entity.setInptDttm(dto.getInptDttm());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setWrkIp(dto.getWrkIp());
		entity.setFlImg1(dto.getFlImg1());
		entity.setFlImg2(dto.getFlImg2());
		entity.setFlImg3(dto.getFlImg3());
		entity.setFlImg4(dto.getFlImg4());
		entity.setFlImg5(dto.getFlImg5());
		return entity;
	}

	public void updateEntity(FacilityList entity) {
		entity.setGiId(this.giId);
		entity.setFlFacilityName(this.flFacilityName);
		entity.setInptDttm(this.inptDttm);
		entity.setInptNbr(this.inptNbr);
		entity.setUpdtDttm(new Date());
		entity.setUpdtNbr(this.updtNbr);
		entity.setWrkIp(this.wrkIp);
		entity.setFlImg1(this.flImg1);
		entity.setFlImg2(this.flImg2);
		entity.setFlImg3(this.flImg3);
		entity.setFlImg4(this.flImg4);
		entity.setFlImg5(this.flImg5);
	}
}
package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.CourseGuide;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CourseGuideDTO {

	private Long cgSeq; // 코스 가이드 시퀀스
	private String cgName; // 골프장 이름
	private String cgCourseName; // 코스 이름
	private String cgGreen; // 그린 (L, R)
	private String cgCompositionName; // 구성이름
	private String cgTee; // 티 이름
	private Long cgHoleNum; // 홀 번호
	private String cgImgUrl; // 지도 이미지 URL
	private String cgBounds; // 바운더리 영역
	private Date inptDttm; // 생성일시
	private String cgBasicBattlefield; //
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private String wrkIp; // IP

	public static CourseGuideDTO toDto(CourseGuide Cg) {
		CourseGuideDTO courseGuideDTO = new CourseGuideDTO();
		courseGuideDTO.setCgSeq(Cg.getCgSeq());
		courseGuideDTO.setCgName(Cg.getCgName());
		courseGuideDTO.setCgCourseName(Cg.getCgCourseName());
		courseGuideDTO.setCgGreen(Cg.getCgGreen());
		courseGuideDTO.setCgCompositionName(Cg.getCgCompositionName());
		courseGuideDTO.setCgTee(Cg.getCgTee());
		courseGuideDTO.setCgHoleNum(Cg.getCgHoleNum());
		courseGuideDTO.setCgImgUrl(Cg.getCgImgUrl());
		courseGuideDTO.setCgBounds(Cg.getCgBounds());
		courseGuideDTO.setInptDttm(Cg.getInptDttm());
		courseGuideDTO.setInptNbr(Cg.getInptNbr());
		courseGuideDTO.setUpdtDttm(Cg.getUpdtDttm());
		courseGuideDTO.setUpdtNbr(Cg.getUpdtNbr());
		courseGuideDTO.setWrkIp(Cg.getWrkIp());
		return courseGuideDTO;
	}

	public static CourseGuide toEntity(CourseGuideDTO dto) {
		CourseGuide entity = new CourseGuide();
		entity.setCgSeq(dto.getCgSeq());
		entity.setCgName(dto.getCgName());
		entity.setCgCourseName(dto.getCgCourseName());
		entity.setCgGreen(dto.getCgGreen());
		entity.setCgCompositionName(dto.getCgCompositionName());
		entity.setCgTee(dto.getCgTee());
		entity.setCgHoleNum(dto.getCgHoleNum());
		entity.setCgImgUrl(dto.getCgImgUrl());
		entity.setCgBounds(dto.getCgBounds());
		entity.setInptDttm(dto.getInptDttm());
		entity.setCgBasicBattlefield(dto.getCgBasicBattlefield());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setWrkIp(dto.getWrkIp());
		return entity;
	}

	public void updateEntity(CourseGuide entity) {
		entity.setCgName(this.cgName);
		entity.setCgCourseName(this.cgCourseName);
		entity.setCgGreen(this.cgGreen);
		entity.setCgCompositionName(this.cgCompositionName);
		entity.setCgTee(this.cgTee);
		entity.setCgHoleNum(this.cgHoleNum);
		entity.setCgImgUrl(this.cgImgUrl);
		entity.setCgBounds(this.cgBounds);
		entity.setCgBasicBattlefield(this.cgBasicBattlefield);
		entity.setUpdtDttm(new Date());
		entity.setUpdtNbr(this.updtNbr);
		entity.setWrkIp(this.wrkIp);
	}
}

package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.CourseList;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CourseListDTO {

	private Long clSeq; // 코스 리스트 시퀀스
	private Long clCourseId; // 코스 리스트 코드
	private String clCourseName; // 코스 이름
	private Date inptDttm; // 생성일시
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private String wrkIp; // IP
	private Long ciCompomentId; // 구성 코드 번호

	public static CourseListDTO toDto(CourseList Cl) {
		CourseListDTO courseListDTO = new CourseListDTO();
		courseListDTO.setClSeq(Cl.getClSeq());
		courseListDTO.setClCourseId(Cl.getClCourseId());
		courseListDTO.setClCourseName(Cl.getClCourseName());
		courseListDTO.setInptDttm(Cl.getInptDttm());
		courseListDTO.setInptNbr(Cl.getInptNbr());
		courseListDTO.setUpdtDttm(Cl.getUpdtDttm());
		courseListDTO.setUpdtNbr(Cl.getUpdtNbr());
		courseListDTO.setWrkIp(Cl.getWrkIp());
		courseListDTO.setCiCompomentId(Cl.getCiCompomentId());
		return courseListDTO;
	}

	public static CourseList toEntity(CourseListDTO dto) {
		CourseList entity = new CourseList();
		entity.setClSeq(dto.getClSeq());
		entity.setClCourseId(dto.getClCourseId());
		entity.setClCourseName(dto.getClCourseName());
		entity.setInptDttm(dto.getInptDttm());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setWrkIp(dto.getWrkIp());
		entity.setCiCompomentId(dto.getCiCompomentId());
		return entity;
	}

	public void updateEntity(CourseList entity) {
		entity.setClCourseName(this.clCourseName);
		entity.setUpdtDttm(new Date());
		entity.setUpdtNbr(this.updtNbr);
		entity.setWrkIp(this.wrkIp);
		entity.setCiCompomentId(this.ciCompomentId);
	}
}

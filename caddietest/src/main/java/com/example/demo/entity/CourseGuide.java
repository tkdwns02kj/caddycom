package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "course_guide")
public class CourseGuide {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CG_SEQ", nullable = false)
	private Long cgSeq; // 코스 가이드 시퀀스

	@Column(name = "CG_NAME", nullable = false)
	private String cgName; // 골프장 이름

	@Column(name = "CG_COURSE_NAME", nullable = false)
	private String cgCourseName; // 코스 이름

	@Column(name = "CG_GREEN")
	private String cgGreen; // 그린 (L, R)

	@Column(name = "CG_COMPOSITION_NAME")
	private String cgCompositionName; // 구성이름

	@Column(name = "CG_TEE")
	private String cgTee; // 티 이름

	@Column(name = "CG_HOLE_NUM")
	private Long cgHoleNum; // 홀 번호

	@Column(name = "CG_IMG_URL")
	private String cgImgUrl; // 지도 이미지 URL

	@Column(name = "CG_BOUNDS")
	private String cgBounds; // 바운더리 영역

	@Column(name = "INPT_DTTM")
	@Temporal(TemporalType.DATE)
	private Date inptDttm; // 생성일시

	@Column(name = "CG_BASIC_BATTLEFIELD")
	private String cgBasicBattlefield; //

	@Column(name = "INPT_NBR")
	private String inptNbr; // 생성자

	@Column(name = "UPDT_DTTM")
	@Temporal(TemporalType.DATE)
	private Date updtDttm; // 수정일시

	@Column(name = "UPDT_NBR")
	private String updtNbr; // 수정자

	@Column(name = "WRK_IP", nullable = false)
	private String wrkIp; // IP

	@PrePersist
	protected void onCreate() {
		inptDttm = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updtDttm = new Date();
	}
}

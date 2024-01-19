package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "facility_list")
public class FacilityList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FL_SEQ", nullable = false)
	private Long flSeq; // 시설 정보 시퀀스

	@Column(name = "GI_ID", nullable = false)
	private Long giId; // 골프장 코드 번호

	@Column(name = "FL_ID", nullable = false)
	private Long flId; // 시설 코드 번호

	@Column(name = "FL_FACILITY_NAME", nullable = false)
	private String flFacilityName; // 시설 이름

	@Column(name = "INPT_DTTM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date inptDttm; // 생성일시

	@Column(name = "INPT_NBR")
	private String inptNbr; // 생성자

	@Column(name = "UPDT_DTTM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updtDttm; // 수정일시

	@Column(name = "UPDT_NBR")
	private String updtNbr; // 수정자

	@Column(name = "WRK_IP", nullable = false)
	private String wrkIp; // IP

	@Column(name = "FL_IMG1")
	private String flImg1; // 이미지

	@Column(name = "FL_IMG2")
	private String flImg2; // 이미지

	@Column(name = "FL_IMG3")
	private String flImg3; // 이미지

	@Column(name = "FL_IMG4")
	private String flImg4; // 이미지

	@Column(name = "FL_IMG5")
	private String flImg5; // 이미지

	@PrePersist
	protected void onCreate() {
		inptDttm = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updtDttm = new Date();
	}
}

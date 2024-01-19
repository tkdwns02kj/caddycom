package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "course_list")
public class CourseList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CL_SEQ", nullable = false)
	private Long clSeq; // 코스 리스트 시퀀스

	@Column(name = "CL_COURSE_ID", nullable = false)
	private Long clCourseId; // 코스 리스트 코드

	@Column(name = "CL_COURSE_NAME", nullable = false)
	private String clCourseName; // 코스 이름

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

	@Column(name = "CI_COMPOMENT_ID")
	private Long ciCompomentId; // 구성 코드 번호

	@PrePersist
	protected void onCreate() {
		inptDttm = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updtDttm = new Date();
	}
}

package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "hole_par_info")
public class HoleParInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HPI_SEQ", nullable = false)
	private Long hpiSeq; // 홀 정보 시퀀스

	@Column(name = "CL_COURSE_ID", nullable = false)
	private Long clCourseId; // 코스 아이디

	@Column(name = "HPI_HOLE_ID", nullable = false)
	private Long hpiHoleId; // 홀 번호(ID)

	@Column(name = "HPI_GREEN")
	private String hpiGreen; // 그린 타입 (L-0, R-1)

	@Column(name = "HPI_PAR_ID", nullable = false)
	private Long hpiParId; // 파 번호(ID)

	@Column(name = "HPI_HDCP")
	private Long hpiHdcp; // 핸디캡

	@Column(name = "HPI_M")
	private Long hpiM; // 티샷에서 홀까지 거리 (m)

	@Column(name = "HPI_YARD")
	private Long hpiYard; // 블루 티샷에서 홀까지 야드 (y)

	@Column(name = "INPT_DTTM")
	@Temporal(TemporalType.DATE)
	private Date inptDttm; // 생성일시

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

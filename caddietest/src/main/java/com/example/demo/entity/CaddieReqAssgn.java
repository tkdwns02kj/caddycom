package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;

@Data
@Entity
@Table(name = "caddie_req_assgn")
public class CaddieReqAssgn {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CRA_SEQ", nullable = false)
	private Long craSeq; // 캐디 배정 요청 시퀀스

	@Column(name = "GI_ID", nullable = false)
	private Long giId; // 골프장 코드

	@Column(name = "CRA_DATE", nullable = false)
	private String craDate; // 예약일자

	@Column(name = "CRA_TIME", nullable = false)
	private String craTime; // 예약시간

	@Column(name = "CRA_CRSE")
	private String craCrse; // 골프장 코스

	@Column(name = "CRA_ASSGN_TYPE")
	private String craAssgnType; // 캐디 타입 (하우스캐디:H, 외부캐디:O)

	@Column(name = "CRA_GENDER_MF")
	private String craGenderMf; // 성별 (남자:M, 여자:F)

	@Column(name = "CRA_ABILITY_TYPE")
	private String craAbilityType; // 경력

	@Column(name = "CRA_APPLY_UI_ID")
	private String craApplyUiId; // 캐디배정 지원자

	@Column(name = "CRA_ASSGN_YN", nullable = false)
	private String craAssgnYn; // 캐디배정 상태 (완료:Y,진행:N)

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

	@Column(name = "WRK_IP")
	private String wrkIp; // IP

	@Column(name = "CRA_RESERVATION_YN", nullable = false)
	private String craReservationYn; // 고객 예약 유무

	@Column(name = "CRA_ACTIVE_HOLE", nullable = false)
	private Long craActiveHole; // 라운드 수

	@PrePersist
	protected void onCreate() {
		inptDttm = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updtDttm = new Date();
	}
}

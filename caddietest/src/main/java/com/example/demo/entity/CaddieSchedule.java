package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "caddie_schedule")
public class CaddieSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CS_SEQ", nullable = false)
	private Long csSeq; // 캐디 스케줄 시퀀스

	@Column(name = "UI_ID", nullable = false)
	private String uiId; // 유저 아이디

	@Column(name = "GI_ID", nullable = false)
	private Long giId; // 골프장 아이디

	@Column(name = "CRA_SEQ", nullable = false)
	private Long craSeq; // 배정리스트 시퀀스

	@Column(name = "CS_DATE")
	private String csDate; // 스케줄 날짜

	@Column(name = "CS_TIME")
	private String csTime; // 스케줄 시간

	@Column(name = "CS_CRSE")
	private String csCrse; // 스케줄 코스

	@Column(name = "CS_REQ_GENDER_M")
	private String csReqGenderM; // 성별 (M:남성)

	@Column(name = "CS_REQ_ABILITY")
	private String csReqAbility;
	// 능력 (N:무관, A:신입, B:1~3년, C:4~6년, D:7~9년, E:10년이상, T:레슨가능)

	@Column(name = "CS_ROUND")
	private String csRound; // 홀 수

	@Column(name = "CS_STATE_CE", nullable = false)
	private String csStateCe; // 상태 (C:확정, E:종료)

	@Column(name = "CS_CADDIE_FEE")
	private String csCaddieFee; // 캐디피

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

	@Column(name = "CS_COMPOMENT", nullable = false)
	private String csCompoment; // 구성

	@Column(name = "CS_ROLE_LEVEL", nullable = false)
	private String csRoleLevel; // 등급

	@Column(name = "CS_REGION", nullable = false)
	private String csRegion; // 지역

	@Column(name = "CS_REQ_GENDER_F")
	private String csReqGenderF; // 성별 (M:여성)

	@PrePersist
	protected void onCreate() {
		inptDttm = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updtDttm = new Date();
	}
}

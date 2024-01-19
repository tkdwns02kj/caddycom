package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "caddie_info")
public class CaddieInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CDI_SEQ", nullable = false)
	private Long cdiSeq; // 캐디 정보 시퀀스

	@Column(name = "GI_ID", nullable = false)
	private Long giId; // 골프장 코드

	@Column(name = "UI_ID", nullable = false)
	private String uiId; // 사용자 아이디

	@Column(name = "CDI_NAME", nullable = false)
	private String cdiName; // 캐디 이름

	@Column(name = "CDI_GENDER_MF", nullable = false)
	private String cdiGenderMf; // 캐디 성별 (M:남자,F:여자)

	@Column(name = "CDI_RESNO", nullable = false)
	private Long cdiResno; // 캐디 번호

	@Column(name = "CDI_PHONE", nullable = false)
	private String cdiPhone; // 캐디 전화번호

	@Column(name = "CDI_GROUP")
	private String cdiGroup; // 캐디 그룹 (조)

	@Column(name = "CDI_TYPE", nullable = false)
	private String cdiType; // 캐디 직급 구분 (1:조원,2:조장,3:마스터)

	@Column(name = "CDI_PHOTO")
	private String cdiPhoto; // 캐디사진

	@Column(name = "CDI_ADDR")
	private String cdiAddr; // 주소

	@Column(name = "CDI_ADDR_DESC")
	private String cdiAddrDesc; // 상세주소

	@Column(name = "CDI_ZIP")
	private String cdiZip; // 우편번호

	@Column(name = "CDI_FEE")
	private Long cdiFee; // 캐디요금

	@Column(name = "CDI_CART_NUM")
	private Long cdiCartNum; // 지정카트번호

	@Column(name = "CDI_JOIN_DTTM")
	private String cdiJoinDttm; // 입사일자

	@Column(name = "CDI_RTMT_DTTM")
	private String cdiRtmtDttm; // 퇴직일자

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

	@PrePersist
	protected void onCreate() {
		inptDttm = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updtDttm = new Date();
	}
}

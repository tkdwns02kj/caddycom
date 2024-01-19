package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "assgn_cancel_log")
public class AssgnCancelLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACL_SEQ", nullable = false)
	private Long aclSeq; // 배정 취소 요청 시퀀스

	@Column(name = "GI_ID", nullable = false)
	private Long giId; // 골프장 아이디

	@Column(name = "CRA_SEQ", nullable = false)
	private Integer craSeq; // 취소 요청한 배정 리스트 시퀀스

	@Column(name = "ACL_DATE")
	private String aclDate; // 취소 요청한 배정 리스트 날짜

	@Column(name = "ACL_TIME")
	private String aclTime; // 취소 요청한 배정 리스트 시간

	@Column(name = "ACL_REQ_UI_ID", nullable = false)
	private String aclReqUiId; // 취소한 관리자 아이디

	@Column(name = "ACL_REV_UI_ID", nullable = false)
	private String aclRevUiId; // 취소 요청한 배정 리스트 배정 캐디

	@Column(name = "ACL_REQ_TYPE", nullable = false)
	private String aclReqType; // 취소 요청 타입 (0:예약취소,1:기상악화,2:기타)

	@Column(name = "ACL_REQ_CONTENT")
	private String aclReqContent; // 취소 요청 내용

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

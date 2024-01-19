package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;

@Data
@Entity
@Table(name = "assgn_open_date")
public class AssgnOpenDate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AOD_SEQ", nullable = false)
	private Long aodSeq; // 배정 리스트 오픈 날짜 시퀀스

	@Column(name = "GI_ID", nullable = false)
	private Long giId; // 골프장 아이디

	@Column(name = "AOD_HOUSE", columnDefinition = "decimal(2,0) default '10'")
	private Integer aodHouse; // 하우스 캐디 오픈 날짜

	@Column(name = "AOD_MASTER", columnDefinition = "decimal(2,0) default '5'")
	private Integer aodMaster; // 마스터 캐디 오픈 날짜

	@Column(name = "AOD_MASTER_YN", columnDefinition = "varchar(1) default 'N'")
	private String aodMasterYn; // 마스터 캐디 사용 유무

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

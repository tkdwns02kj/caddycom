package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "compoment_info")
public class CompomentInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CI_SEQ", nullable = false)
	private Long ciSeq; // 구성 정보 시퀀스

	@Column(name = "GI_ID", nullable = false)
	private Long giId; // 골프장 코드 번호

	@Column(name = "CI_COMPOMENT_ID", nullable = false)
	private Long ciCompomentId; // 구성 코드 번호

	@Column(name = "CI_COMPOMENT_NAME")
	private String ciCompomentName; // 구성 이름

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

	@PrePersist
	protected void onCreate() {
		inptDttm = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updtDttm = new Date();
	}
}

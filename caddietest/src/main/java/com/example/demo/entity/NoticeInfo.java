package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "notice_info")
public class NoticeInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NI_SEQ", nullable = false)
	private Long niSeq; // 공지사항 정보 시퀀스

	@Column(name = "NI_GI_ID", nullable = false)
	private Long niGiId; // 골프장 코드 번호

	@Column(name = "NI_UI_ROLE_LEVEL", nullable = false, length = 45)
	private String niUiRoleLevel; // 직급구분(무관-0,조원-1,조장-3,직원-5,일반관리자-7,상위관리자-8)

	@Column(name = "NI_ID", nullable = false)
	private Long niId; // 공지사항 코드 번호

	@Column(name = "NI_TITLE", nullable = false, length = 50)
	private String niTitle; // 공지사항 제목

	@Column(name = "NI_CONTENT", nullable = false, length = 2000)
	private String niContent; // 공지사항의 내용을 저장하는 컬럼

	@Column(name = "INPT_DTTM", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date inptDttm; // 생성일시

	@Column(name = "INPT_NBR", length = 45)
	private String inptNbr; // 생성자

	@Column(name = "UPDT_DTTM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updtDttm; // 수정일시

	@Column(name = "UPDT_NBR", length = 50)
	private String updtNbr; // 수정자

	@Column(name = "NI_IS_ACTIVE")
	private Boolean niIsActive; // 공지사항의 활성/비활성 상태를 나타내는 불리언(Boolean) 컬럼입니다.

	@Column(name = "NI_PRIORITY_LEVEL")
	private Long niPriorityLevel; // 공지사항의 우선 순위를 나타내는 컬럼입니다.

	@Column(name = "NI_ATTACHMENTS", length = 1000)
	private String niAttachments; // 공지사항에 첨부된 파일이나 이미지의 경로 또는 링크를 저장하는 컬럼입니다.

	@Column(name = "NI_VIEWS")
	private Long niViews; // 조회수

	@Column(name = "NI_WRITER", length = 255)
	private String niWriter; // 공지사항 작성자

	@PrePersist
	protected void onCreate() {
		inptDttm = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updtDttm = new Date();
	}
}

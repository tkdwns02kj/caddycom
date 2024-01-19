package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "hole_par_ment")
public class HoleParMent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HPM_SEQ", nullable = false)
	private Long hpmSeq; // 홀파 정보 시퀀스

	@Column(name = "CL_HPMCOURSE_ID", nullable = false)
	private Long clHpmcourseId; // 코스 아이디

	@Column(name = "HPM_GI_ID", nullable = false)
	private Long hpmGiId; // 골프장 코드 번호

	@Column(name = "HPI_HOLE_ID", nullable = false)
	private Long hpiHoleId; // 홀 번호(ID)

	@Column(name = "HPI_PAR_ID", nullable = false)
	private Long hpiParId; // 파 번호(ID)

	@Column(name = "HPM_INFO_MENT", length = 1000)
	private String hpmInfoMent; // 안내 멘트

	@Column(name = "HPM_BUNKER_MENT", length = 1000)
	private String hpmBunkerMent; // 벙커 멘트

	@Column(name = "HPM_GREEN_MENT", length = 1000)
	private String hpmGreenMent; // 그린 멘트

	@Column(name = "HPM_TIPTYPE", nullable = false, length = 1)
	private String hpmTipType; // 팁 타입(1:코스공략, 2:아이피,3:기타)

	@Column(name = "INPT_DTTM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date inptDttm; // 입력일자

	// 여기는 왜 앱력자와 수정자가 없는가

	@Column(name = "UPDT_DTTM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updtDttm; // 수정일자

	@Column(name = "M_OS", length = 3)
	private String mOs; // 구분 AOS, IOS

	@PrePersist
	protected void onCreate() {
		inptDttm = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updtDttm = new Date();
	}
}

package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user_info")
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UI_SEQ", nullable = false)
	private Long uiSeq; // 사용자 정보 시퀀스 번호

	@Column(name = "GI_ID")
	private Long giId; // 골프장 코드

	@Column(name = "UI_ID", nullable = false, length = 50)
	private String uiId; // 사용자 ID (email)

	@Column(name = "UI_PW", nullable = false)
	private byte[] uiPw; // 패스워드 (Blob으로 저장)

	@Column(name = "UI_NAME", nullable = false, length = 60)
	private String uiName; // 이름

	@Column(name = "UI_SELF_INTRO", length = 60)
	private String uiSelfIntro; // [캐디] 자기소개

	@Column(name = "UI_PHONE", nullable = false, length = 20)
	private String uiPhone; // 연락처

	@Column(name = "UI_BIRTH", nullable = false, length = 4)
	private String uiBirth; // 출생년도(yyyy)

	@Column(name = "UI_GENDER_MF", nullable = false, length = 60)
	private String uiGenderMf; // 성별(M: 남성, F: 여성)

	@Column(name = "UI_ROLE_TYPE", length = 1)
	private String uiRoleType; // 역할구분(마스터캐디-O, 하우스캐디-H, 시설팀-F, 경기진행팀-P, 관리자-M, 관제카트-C)

	@Column(name = "UI_ROLE_LEVEL", length = 1)
	private String uiRoleLevel; // 직급구분(무관-0,조원-1,조장-3,직원-5,일반관리자-7,상위관리자-8)

	@Column(name = "UI_DEVICE_ID", length = 50)
	private String uiDeviceId; // 디바이스 아이디

	@Column(name = "UI_KA_NICKNAME", length = 60)
	private String uiKaNickname; // (SNS)카카오톡 닉네임

	@Column(name = "UI_KA_ACNT_EMAIL", length = 100)
	private String uiKaAcntEmail; // (SNS)카카오톡 이메일

	@Column(name = "UI_KA_PROF_IMG", length = 500)
	private String uiKaProfImg; // (SNS)카카오톡 프로필 이미지

	@Column(name = "UI_NV_ID", length = 50)
	private String uiNvId; // (SNS)네이버 아이디

	@Column(name = "UI_NV_NICKNAME", length = 60)
	private String uiNvNickname; // (SNS)네이버 닉네임

	@Column(name = "UI_NV_NAME", length = 60)
	private String uiNvName; // (SNS)네이버 이름

	@Column(name = "UI_NV_EMAIL", length = 50)
	private String uiNvEmail; // (SNS)네이버 이메일

	@Column(name = "UI_PHOTO", length = 500)
	private String uiPhoto; // 사용자 프로필 사진

	@Column(name = "UI_RESUME", length = 40)
	private String uiResume; // 경력 OO년

	@Column(name = "UI_FAVOURITE_AREA", length = 300)
	private String uiFavouriteArea; // 주요활동지역(광역시,도 단위)

	@Column(name = "UI_SMS_FORWARD_YN", length = 1)
	private String uiSmsForwardYn; // 문자수신 여부 (Y:허용, N:거부)

	@Column(name = "UI_WANT_DAYS", length = 13)
	private String uiWantDays; // 희망근무요일(일:0,월:1,화:2,수:3,목:4,금:5,토:6)

	@Column(name = "UI_IS_FIRST_LOG_YN", nullable = false, length = 1)
	private String uiIsFirstLogYn; // 첫 로그인 여부

	@Column(name = "INPT_DTTM")
	private Date inptDttm; // 가입일시

	@Column(name = "UPDT_DTTM")
	private Date updtDttm; // 수정일시

	@Column(name = "FIRST_DTTM")
	private Date firstDttm; // 첫 로그인 일시

	@Column(name = "WRK_IP", length = 32)
	private String wrkIp; // IP

	@Column(name = "UI_ADDR", length = 255)
	private String uiAddr; // 주소 (마스터캐디) 사용 X

	@Column(name = "UI_ADDR_DESC", length = 255)
	private String uiAddrDesc; // 상세주소 (마스터캐디) 사용 X

	@Column(name = "UI_FAVORIT_GI_ID", length = 50)
	private String uiFavoritGiId; // 관심있는 골프장 (마스터캐디)

	@Column(name = "UI_TEACHING_YN", length = 1)
	private String uiTeachingYn; // 티칭프로 유무(Y:O N:X)

	@Column(name = "UI_TEACHING_CERT", length = 255)
	private String uiTeachingCert; // 티칭프로 증명서 위치

	@Column(name = "UI_FROM", nullable = false, length = 1)
	private String uiFrom; // 가입한 앱 (M:매니저, C:캐디)

	@Column(name = "UI_PREV_RESUME", length = 500)
	private String uiPrevResume; // 과거 근무골프장 (마스터캐디) :GI_NAME,GI_ID,경력@

	@Column(name = "UI_UPDATE_REC_NOTI", columnDefinition = "TINYINT DEFAULT '0'")
	private Boolean uiUpdateRecNoti; // 업데이트 알림 수신

	@Column(name = "UI_PROF_IMG", length = 500)
	private String uiProfImg; // 프로필 이미지

	@Column(name = "UI_DES_GOLF_ADDR", length = 255)
	private String uiDesGolfAddr; // 지정골프장 주소

	@Column(name = "UI_DES_GOLF_NAME", length = 255)
	private String uiDesGolfName; // 지정골프장 이름

	@PrePersist
	protected void onCreate() {
		inptDttm = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updtDttm = new Date();
	}
}

package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.UserInfo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserInfoDTO {

	private Long uiSeq; // 사용자 정보 시퀀스 번호
	private Long giId; // 골프장 코드
	private String uiId; // 사용자 ID (email)
	private byte[] uiPw; // 패스워드 (Blob으로 저장)
	private String uiName; // 이름
	private String uiSelfIntro; // [캐디] 자기소개
	private String uiPhone; // 연락처
	private String uiBirth; // 출생년도(yyyy)
	private String uiGenderMf; // 성별(M: 남성, F: 여성)
	private String uiRoleType; // 역할구분(마스터캐디-O, 하우스캐디-H, 시설팀-F, 경기진행팀-P, 관리자-M, 관제카트-C)
	private String uiRoleLevel; // 직급구분(무관-0,조원-1,조장-3,직원-5,일반관리자-7,상위관리자-8)
	private String uiDeviceId; // 디바이스 아이디
	private String uiKaNickname; // (SNS)카카오톡 닉네임
	private String uiKaAcntEmail; // (SNS)카카오톡 이메일
	private String uiKaProfImg; // (SNS)카카오톡 프로필 이미지
	private String uiNvId; // (SNS)네이버 아이디
	private String uiNvNickname; // (SNS)네이버 닉네임
	private String uiNvName; // (SNS)네이버 이름
	private String uiNvEmail; // (SNS)네이버 이메일
	private String uiPhoto; // 사용자 프로필 사진
	private String uiResume; // 경력 OO년
	private String uiFavouriteArea; // 주요활동지역(광역시,도 단위)
	private String uiSmsForwardYn; // 문자수신 여부 (Y:허용, N:거부)
	private String uiWantDays; // 희망근무요일(일:0,월:1,화:2,수:3,목:4,금:5,토:6)
	private String uiIsFirstLogYn; // 첫 로그인 여부
	private Date inptDttm; // 가입일시
	private Date updtDttm; // 수정일시
	private Date firstDttm; // 첫 로그인 일시
	private String wrkIp; // IP
	private String uiAddr; // 주소 (마스터캐디) 사용 X
	private String uiAddrDesc; // 상세주소 (마스터캐디) 사용 X
	private String uiFavoritGiId; // 관심있는 골프장 (마스터캐디)
	private String uiTeachingYn; // 티칭프로 유무(Y:O N:X)
	private String uiTeachingCert; // 티칭프로 증명서 위치
	private String uiFrom; // 가입한 앱 (M:매니저, C:캐디)
	private String uiPrevResume; // 과거 근무골프장 (마스터캐디) :GI_NAME,GI_ID,경력@
	private Boolean uiUpdateRecNoti; // 업데이트 알림 수신
	private String uiProfImg; // 프로필 이미지
	private String uiDesGolfAddr; // 지정골프장 주소
	private String uiDesGolfName; // 지정골프장 이름

	public static UserInfoDTO toDto(UserInfo Ui) {
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		userInfoDTO.setUiSeq(Ui.getUiSeq());
		userInfoDTO.setGiId(Ui.getGiId());
		userInfoDTO.setUiId(Ui.getUiId());
		userInfoDTO.setUiPw(Ui.getUiPw());
		userInfoDTO.setUiName(Ui.getUiName());
		userInfoDTO.setUiSelfIntro(Ui.getUiSelfIntro());
		userInfoDTO.setUiPhone(Ui.getUiPhone());
		userInfoDTO.setUiBirth(Ui.getUiBirth());
		userInfoDTO.setUiGenderMf(Ui.getUiGenderMf());
		userInfoDTO.setUiRoleType(Ui.getUiRoleType());
		userInfoDTO.setUiRoleLevel(Ui.getUiRoleLevel());
		userInfoDTO.setUiDeviceId(Ui.getUiDeviceId());
		userInfoDTO.setUiKaNickname(Ui.getUiKaNickname());
		userInfoDTO.setUiKaAcntEmail(Ui.getUiKaAcntEmail());
		userInfoDTO.setUiKaProfImg(Ui.getUiKaProfImg());
		userInfoDTO.setUiNvId(Ui.getUiNvId());
		userInfoDTO.setUiNvNickname(Ui.getUiNvNickname());
		userInfoDTO.setUiNvName(Ui.getUiNvName());
		userInfoDTO.setUiNvEmail(Ui.getUiNvEmail());
		userInfoDTO.setUiPhoto(Ui.getUiPhoto());
		userInfoDTO.setUiResume(Ui.getUiResume());
		userInfoDTO.setUiFavouriteArea(Ui.getUiFavouriteArea());
		userInfoDTO.setUiSmsForwardYn(Ui.getUiSmsForwardYn());
		userInfoDTO.setUiWantDays(Ui.getUiWantDays());
		userInfoDTO.setUiIsFirstLogYn(Ui.getUiIsFirstLogYn());
		userInfoDTO.setInptDttm(Ui.getInptDttm());
		userInfoDTO.setUpdtDttm(Ui.getUpdtDttm());
		userInfoDTO.setFirstDttm(Ui.getFirstDttm());
		userInfoDTO.setWrkIp(Ui.getWrkIp());
		userInfoDTO.setUiAddr(Ui.getUiAddr());
		userInfoDTO.setUiAddrDesc(Ui.getUiAddrDesc());
		userInfoDTO.setUiFavoritGiId(Ui.getUiFavoritGiId());
		userInfoDTO.setUiTeachingYn(Ui.getUiTeachingYn());
		userInfoDTO.setUiTeachingCert(Ui.getUiTeachingCert());
		userInfoDTO.setUiFrom(Ui.getUiFrom());
		userInfoDTO.setUiPrevResume(Ui.getUiPrevResume());
		userInfoDTO.setUiUpdateRecNoti(Ui.getUiUpdateRecNoti());
		userInfoDTO.setUiProfImg(Ui.getUiProfImg());
		userInfoDTO.setUiDesGolfAddr(Ui.getUiDesGolfAddr());
		userInfoDTO.setUiDesGolfName(Ui.getUiDesGolfName());
		return userInfoDTO;
	}

	public static UserInfo toEntity(UserInfoDTO dto) {
		UserInfo entity = new UserInfo();
		entity.setUiSeq(dto.getUiSeq());
		entity.setGiId(dto.getGiId());
		entity.setUiId(dto.getUiId());
		entity.setUiPw(dto.getUiPw());
		entity.setUiName(dto.getUiName());
		entity.setUiSelfIntro(dto.getUiSelfIntro());
		entity.setUiPhone(dto.getUiPhone());
		entity.setUiBirth(dto.getUiBirth());
		entity.setUiGenderMf(dto.getUiGenderMf());
		entity.setUiRoleType(dto.getUiRoleType());
		entity.setUiRoleLevel(dto.getUiRoleLevel());
		entity.setUiDeviceId(dto.getUiDeviceId());
		entity.setUiKaNickname(dto.getUiKaNickname());
		entity.setUiKaAcntEmail(dto.getUiKaAcntEmail());
		entity.setUiKaProfImg(dto.getUiKaProfImg());
		entity.setUiNvId(dto.getUiNvId());
		entity.setUiNvNickname(dto.getUiNvNickname());
		entity.setUiNvName(dto.getUiNvName());
		entity.setUiNvEmail(dto.getUiNvEmail());
		entity.setUiPhoto(dto.getUiPhoto());
		entity.setUiResume(dto.getUiResume());
		entity.setUiFavouriteArea(dto.getUiFavouriteArea());
		entity.setUiSmsForwardYn(dto.getUiSmsForwardYn());
		entity.setUiWantDays(dto.getUiWantDays());
		entity.setUiIsFirstLogYn(dto.getUiIsFirstLogYn());
		entity.setInptDttm(dto.getInptDttm());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setFirstDttm(dto.getFirstDttm());
		entity.setWrkIp(dto.getWrkIp());
		entity.setUiAddr(dto.getUiAddr());
		entity.setUiAddrDesc(dto.getUiAddrDesc());
		entity.setUiFavoritGiId(dto.getUiFavoritGiId());
		entity.setUiTeachingYn(dto.getUiTeachingYn());
		entity.setUiTeachingCert(dto.getUiTeachingCert());
		entity.setUiFrom(dto.getUiFrom());
		entity.setUiPrevResume(dto.getUiPrevResume());
		entity.setUiUpdateRecNoti(dto.getUiUpdateRecNoti());
		entity.setUiProfImg(dto.getUiProfImg());
		entity.setUiDesGolfAddr(dto.getUiDesGolfAddr());
		entity.setUiDesGolfName(dto.getUiDesGolfName());
		return entity;
	}

	public void updateEntity(UserInfo entity) {
		entity.setGiId(this.giId);
		entity.setUiId(this.uiId);
		entity.setUiPw(this.uiPw);
		entity.setUiName(this.uiName);
		entity.setUiSelfIntro(this.uiSelfIntro);
		entity.setUiPhone(this.uiPhone);
		entity.setUiBirth(this.uiBirth);
		entity.setUiGenderMf(this.uiGenderMf);
		entity.setUiRoleType(this.uiRoleType);
		entity.setUiRoleLevel(this.uiRoleLevel);
		entity.setUiDeviceId(this.uiDeviceId);
		entity.setUiKaNickname(this.uiKaNickname);
		entity.setUiKaAcntEmail(this.uiKaAcntEmail);
		entity.setUiKaProfImg(this.uiKaProfImg);
		entity.setUiNvId(this.uiNvId);
		entity.setUiNvNickname(this.uiNvNickname);
		entity.setUiNvName(this.uiNvName);
		entity.setUiNvEmail(this.uiNvEmail);
		entity.setUiPhoto(this.uiPhoto);
		entity.setUiResume(this.uiResume);
		entity.setUiFavouriteArea(this.uiFavouriteArea);
		entity.setUiSmsForwardYn(this.uiSmsForwardYn);
		entity.setUiWantDays(this.uiWantDays);
		entity.setUiIsFirstLogYn(this.uiIsFirstLogYn);
		entity.setInptDttm(this.inptDttm);
		entity.setUpdtDttm(new Date());
		entity.setFirstDttm(this.firstDttm);
		entity.setWrkIp(this.wrkIp);
		entity.setUiAddr(this.uiAddr);
		entity.setUiAddrDesc(this.uiAddrDesc);
		entity.setUiFavoritGiId(this.uiFavoritGiId);
		entity.setUiTeachingYn(this.uiTeachingYn);
		entity.setUiTeachingCert(this.uiTeachingCert);
		entity.setUiFrom(this.uiFrom);
		entity.setUiPrevResume(this.uiPrevResume);
		entity.setUiUpdateRecNoti(this.uiUpdateRecNoti);
		entity.setUiProfImg(this.uiProfImg);
		entity.setUiDesGolfAddr(this.uiDesGolfAddr);
		entity.setUiDesGolfName(this.uiDesGolfName);
	}
}

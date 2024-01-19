package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.GolfInfo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GolfInfoDTO {

	private Long giSeq; // 골프장 정보 시퀀스
	private Long giId; // 골프장 코드 번호
	private String giName; // 골프장 이름
	private String giAddr; // 주소
	private String giArea; // 지역
	private String giIntro; // 소개
	private String giImgUrl; // 이미지 URL
	private String giMemberNum; // 회원 수
	private Long giScale; // 골프장 홀 개수
	private String giTel; // 골프장 전화번호
	private String giLat; // 골프장 위치 위도
	private String giLng; // 골프장 위치 경도
	private String giUseYn; // 골프장 사용유무 (Y, N)
	private String giLTopLat; // 골프장 영역 좌상단 위도
	private String giLTopLng; // 골프장 영역 좌상단 경도
	private String giRBottomLat; // 골프장 영역 우하단 위도
	private String giRBottomLng; // 골프장 영역 우하단 경도
	private String giGolfArea; // 골프장 영역
	private String giGreen; // 골프장 필드 타입 (L-기본, R-홀2개인 경우)
	private String giCartStorage; // 카트 저장고 위치
	private Date inptDttm; // 생성일시
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private String wrkIp; // IP
	private String giType; // 퍼블릭 : P, 회원제 : M
	private String giChairman; // 회장명
	private String openDate; // 개장일
	private String giAmenity; // 부대시설
	private String giCourse; // 코스
	private String giCompanyName; // 기업명
	private String giFaxTel; // 골프장 팩스번호
	private String giCart; // 카트
	private String giLocaInfo; // 위치안내
	private String giUseCar; // 자가용이용
	private String giUsePublictran; // 대중교통이용

	public static GolfInfoDTO toDto(GolfInfo Gi) {
		GolfInfoDTO golfInfoDTO = new GolfInfoDTO();
		golfInfoDTO.setGiSeq(Gi.getGiSeq());
		golfInfoDTO.setGiId(Gi.getGiId());
		golfInfoDTO.setGiName(Gi.getGiName());
		golfInfoDTO.setGiAddr(Gi.getGiAddr());
		golfInfoDTO.setGiArea(Gi.getGiArea());
		golfInfoDTO.setGiIntro(Gi.getGiIntro());
		golfInfoDTO.setGiImgUrl(Gi.getGiImgUrl());
		golfInfoDTO.setGiMemberNum(Gi.getGiMemberNum());
		golfInfoDTO.setGiScale(Gi.getGiScale());
		golfInfoDTO.setGiTel(Gi.getGiTel());
		golfInfoDTO.setGiLat(Gi.getGiLat());
		golfInfoDTO.setGiLng(Gi.getGiLng());
		golfInfoDTO.setGiUseYn(Gi.getGiUseYn());
		golfInfoDTO.setGiLTopLat(Gi.getGiLTopLat());
		golfInfoDTO.setGiLTopLng(Gi.getGiLTopLng());
		golfInfoDTO.setGiRBottomLat(Gi.getGiRBottomLat());
		golfInfoDTO.setGiRBottomLng(Gi.getGiRBottomLng());
		golfInfoDTO.setGiGolfArea(Gi.getGiGolfArea());
		golfInfoDTO.setGiGreen(Gi.getGiGreen());
		golfInfoDTO.setGiCartStorage(Gi.getGiCartStorage());
		golfInfoDTO.setInptDttm(Gi.getInptDttm());
		golfInfoDTO.setInptNbr(Gi.getInptNbr());
		golfInfoDTO.setUpdtDttm(Gi.getUpdtDttm());
		golfInfoDTO.setUpdtNbr(Gi.getUpdtNbr());
		golfInfoDTO.setWrkIp(Gi.getWrkIp());
		golfInfoDTO.setGiType(Gi.getGiType());
		golfInfoDTO.setGiChairman(Gi.getGiChairman());
		golfInfoDTO.setOpenDate(Gi.getOpenDate());
		golfInfoDTO.setGiAmenity(Gi.getGiAmenity());
		golfInfoDTO.setGiCourse(Gi.getGiCourse());
		golfInfoDTO.setGiCompanyName(Gi.getGiCompanyName());
		golfInfoDTO.setGiFaxTel(Gi.getGiFaxTel());
		golfInfoDTO.setGiCart(Gi.getGiCart());
		golfInfoDTO.setGiLocaInfo(Gi.getGiLocaInfo());
		golfInfoDTO.setGiUseCar(Gi.getGiUseCar());
		golfInfoDTO.setGiUsePublictran(Gi.getGiUsePublictran());
		return golfInfoDTO;
	}

	public static GolfInfo toEntity(GolfInfoDTO dto) {
		GolfInfo entity = new GolfInfo();
		entity.setGiSeq(dto.getGiSeq());
		entity.setGiId(dto.getGiId());
		entity.setGiName(dto.getGiName());
		entity.setGiAddr(dto.getGiAddr());
		entity.setGiArea(dto.getGiArea());
		entity.setGiIntro(dto.getGiIntro());
		entity.setGiImgUrl(dto.getGiImgUrl());
		entity.setGiMemberNum(dto.getGiMemberNum());
		entity.setGiScale(dto.getGiScale());
		entity.setGiTel(dto.getGiTel());
		entity.setGiLat(dto.getGiLat());
		entity.setGiLng(dto.getGiLng());
		entity.setGiUseYn(dto.getGiUseYn());
		entity.setGiLTopLat(dto.getGiLTopLat());
		entity.setGiLTopLng(dto.getGiLTopLng());
		entity.setGiRBottomLat(dto.getGiRBottomLat());
		entity.setGiRBottomLng(dto.getGiRBottomLng());
		entity.setGiGolfArea(dto.getGiGolfArea());
		entity.setGiGreen(dto.getGiGreen());
		entity.setGiCartStorage(dto.getGiCartStorage());
		entity.setInptDttm(dto.getInptDttm());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setWrkIp(dto.getWrkIp());
		entity.setGiType(dto.getGiType());
		entity.setGiChairman(dto.getGiChairman());
		entity.setOpenDate(dto.getOpenDate());
		entity.setGiAmenity(dto.getGiAmenity());
		entity.setGiCourse(dto.getGiCourse());
		entity.setGiCompanyName(dto.getGiCompanyName());
		entity.setGiFaxTel(dto.getGiFaxTel());
		entity.setGiCart(dto.getGiCart());
		entity.setGiLocaInfo(dto.getGiLocaInfo());
		entity.setGiUseCar(dto.getGiUseCar());
		entity.setGiUsePublictran(dto.getGiUsePublictran());
		return entity;
	}

	public void updateEntity(GolfInfo entity) {
		entity.setGiId(this.giId);
		entity.setGiName(this.giName);
		entity.setGiAddr(this.giAddr);
		entity.setGiArea(this.giArea);
		entity.setGiIntro(this.giIntro);
		entity.setGiImgUrl(this.giImgUrl);
		entity.setGiMemberNum(this.giMemberNum);
		entity.setGiScale(this.giScale);
		entity.setGiTel(this.giTel);
		entity.setGiLat(this.giLat);
		entity.setGiLng(this.giLng);
		entity.setGiUseYn(this.giUseYn);
		entity.setGiLTopLat(this.giLTopLat);
		entity.setGiLTopLng(this.giLTopLng);
		entity.setGiRBottomLat(this.giRBottomLat);
		entity.setGiRBottomLng(this.giRBottomLng);
		entity.setGiGolfArea(this.giGolfArea);
		entity.setGiGreen(this.giGreen);
		entity.setGiCartStorage(this.giCartStorage);
		entity.setInptDttm(this.inptDttm);
		entity.setInptNbr(this.inptNbr);
		entity.setUpdtDttm(new Date());
		entity.setUpdtNbr(this.updtNbr);
		entity.setWrkIp(this.wrkIp);
		entity.setGiType(this.giType);
		entity.setGiChairman(this.giChairman);
		entity.setOpenDate(this.openDate);
		entity.setGiAmenity(this.giAmenity);
		entity.setGiCourse(this.giCourse);
		entity.setGiCompanyName(this.giCompanyName);
		entity.setGiFaxTel(this.giFaxTel);
		entity.setGiCart(this.giCart);
		entity.setGiLocaInfo(this.giLocaInfo);
		entity.setGiUseCar(this.giUseCar);
		entity.setGiUsePublictran(this.giUsePublictran);
	}
}

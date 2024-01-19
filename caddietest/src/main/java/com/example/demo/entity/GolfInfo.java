package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "golf_info")
public class GolfInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GI_SEQ", nullable = false)
	private Long giSeq; // 골프장 정보 시퀀스

	@Column(name = "GI_ID", nullable = false)
	private Long giId; // 골프장 코드 번호

	@Column(name = "GI_NAME", nullable = false)
	private String giName; // 골프장 이름

	@Column(name = "GI_ADDR")
	private String giAddr; // 주소

	@Column(name = "GI_AREA")
	private String giArea; // 지역

	@Column(name = "GI_INTRO")
	private String giIntro; // 소개

	@Column(name = "GI_IMG_URL")
	private String giImgUrl; // 이미지 URL

	@Column(name = "GI_MEMBER_NUM")
	private String giMemberNum; // 회원 수

	@Column(name = "GI_SCALE")
	private Long giScale; // 골프장 홀 개수

	@Column(name = "GI_TEL")
	private String giTel; // 골프장 전화번호

	@Column(name = "GI_LAT")
	private String giLat; // 골프장 위치 위도

	@Column(name = "GI_LNG")
	private String giLng; // 골프장 위치 경도

	@Column(name = "GI_USE_YN")
	private String giUseYn; // 골프장 사용유무 (Y, N)

	@Column(name = "GI_L_TOP_LAT")
	private String giLTopLat; // 골프장 영역 좌상단 위도

	@Column(name = "GI_L_TOP_LNG")
	private String giLTopLng; // 골프장 영역 좌상단 경도

	@Column(name = "GI_R_BOTTOM_LAT")
	private String giRBottomLat; // 골프장 영역 우하단 위도

	@Column(name = "GI_R_BOTTOM_LNG")
	private String giRBottomLng; // 골프장 영역 우하단 경도

	@Column(name = "GI_GOLF_AREA")
	private String giGolfArea; // 골프장 영역

	@Column(name = "GI_GREEN")
	private String giGreen; // 골프장 필드 타입 (L-기본, R-홀2개인 경우)

	@Column(name = "GI_CART_STORAGE")
	private String giCartStorage; // 카트 저장고 위치

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

	@Column(name = "GI_TYPE")
	private String giType; // 퍼블릭 : P, 회원제 : M

	@Column(name = "GI_CHAIRMAN")
	private String giChairman; // 회장명

	@Column(name = "OPEN_DATE")
	private String openDate; // 개장일

	@Column(name = "GI_AMENITY")
	private String giAmenity; // 부대시설

	@Column(name = "GI_COURSE")
	private String giCourse; // 코스

	@Column(name = "GI_COMPANY_NAME")
	private String giCompanyName; // 기업명

	@Column(name = "GI_FAX_TEL")
	private String giFaxTel; // 골프장 팩스번호

	@Column(name = "GI_CART")
	private String giCart; // 카트

	@Column(name = "GI_LOCA_INFO")
	private String giLocaInfo; // 위치안내

	@Column(name = "GI_USE_CAR")
	private String giUseCar; // 자가용이용

	@Column(name = "GI_USE_PUBLICTRAN")
	private String giUsePublictran; // 대중교통이용

	@PrePersist
	protected void onCreate() {
		inptDttm = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		updtDttm = new Date();
	}

}

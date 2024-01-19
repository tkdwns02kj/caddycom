package com.example.demo.entity;

import lombok.Data;
import java.util.Date;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "facility_info")
public class FacilityInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FI_SEQ", nullable = false)
	private Long fiSeq; // 시설 정보 시퀀스

	@Column(name = "FL_ID", nullable = false)
	private Long flId; // 시설 정보 코드

	@Column(name = "FI_CATEGORY_NAME")
	private String fiCategoryName; // 카테고리 이름 ex) 조식,코스메뉴

	@Column(name = "FI_CATEGORY_ID", nullable = false)
	private Long fiCategoryId; // 카테고리 코드 번호

	@Column(name = "FI_CATEGORY_CONTENT")
	private String fiCategoryContent; // 카테고리 내용

	@Column(name = "FI_IMG1")
	private String fiImg1; // 이미지

	@Column(name = "FI_IMG2")
	private String fiImg2; // 이미지

	@Column(name = "FI_IMG3")
	private String fiImg3; // 이미지

	@Column(name = "FI_IMG4")
	private String fiImg4; // 이미지

	@Column(name = "FI_IMG5")
	private String fiImg5; // 이미지

}

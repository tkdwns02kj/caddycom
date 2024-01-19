package com.example.demo.dto;

import com.example.demo.entity.FacilityInfo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FacilityInfoDTO {

	private Long fiSeq; // 시설 정보 시퀀스
	private Long flId; // 시설 정보 코드
	private String fiCategoryName; // 카테고리 이름 ex) 조식,코스메뉴
	private Long fiCategoryId; // 카테고리 코드 번호
	private String fiCategoryContent; // 카테고리 내용
	private String fiImg1; // 이미지
	private String fiImg2; // 이미지
	private String fiImg3; // 이미지
	private String fiImg4; // 이미지
	private String fiImg5; // 이미지

	public static FacilityInfoDTO toDto(FacilityInfo Fi) {
		FacilityInfoDTO facilityInfoDTO = new FacilityInfoDTO();
		facilityInfoDTO.setFiSeq(Fi.getFiSeq());
		facilityInfoDTO.setFlId(Fi.getFlId());
		facilityInfoDTO.setFiCategoryName(Fi.getFiCategoryName());
		facilityInfoDTO.setFiCategoryId(Fi.getFiCategoryId());
		facilityInfoDTO.setFiCategoryContent(Fi.getFiCategoryContent());
		facilityInfoDTO.setFiImg1(Fi.getFiImg1());
		facilityInfoDTO.setFiImg2(Fi.getFiImg2());
		facilityInfoDTO.setFiImg3(Fi.getFiImg3());
		facilityInfoDTO.setFiImg4(Fi.getFiImg4());
		facilityInfoDTO.setFiImg5(Fi.getFiImg5());
		return facilityInfoDTO;
	}

	public static FacilityInfo toEntity(FacilityInfoDTO dto) {
		FacilityInfo entity = new FacilityInfo();
		entity.setFiSeq(dto.getFiSeq());
		entity.setFlId(dto.getFlId());
		entity.setFiCategoryName(dto.getFiCategoryName());
		entity.setFiCategoryId(dto.getFiCategoryId());
		entity.setFiCategoryContent(dto.getFiCategoryContent());
		entity.setFiImg1(dto.getFiImg1());
		entity.setFiImg2(dto.getFiImg2());
		entity.setFiImg3(dto.getFiImg3());
		entity.setFiImg4(dto.getFiImg4());
		entity.setFiImg5(dto.getFiImg5());
		return entity;
	}

	public void updateEntity(FacilityInfo entity) {
		entity.setFlId(this.flId);
		entity.setFiCategoryName(this.fiCategoryName);
		entity.setFiCategoryId(this.fiCategoryId);
		entity.setFiCategoryContent(this.fiCategoryContent);
		entity.setFiImg1(this.fiImg1);
		entity.setFiImg2(this.fiImg2);
		entity.setFiImg3(this.fiImg3);
		entity.setFiImg4(this.fiImg4);
		entity.setFiImg5(this.fiImg5);
	}
}
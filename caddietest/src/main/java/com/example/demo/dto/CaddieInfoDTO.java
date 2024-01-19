package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.CaddieInfo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CaddieInfoDTO {

	private Long cdiSeq; // 캐디 정보 시퀀스
	private Long giId; // 골프장 코드
	private String uiId; // 사용자 아이디
	private String cdiName; // 캐디 이름
	private String cdiGenderMf; // 캐디 성별 (M:남자,F:여자)
	private Long cdiResno; // 캐디 번호
	private String cdiPhone; // 캐디 전화번호
	private String cdiGroup; // 캐디 그룹 (조)
	private String cdiType; // 캐디 직급 구분 (1:조원,2:조장,3:마스터)
	private String cdiPhoto; // 캐디사진
	private String cdiAddr; // 주소
	private String cdiAddrDesc; // 상세주소
	private String cdiZip; // 우편번호
	private Long cdiFee; // 캐디요금
	private Long cdiCartNum; // 지정카트번호
	private String cdiJoinDttm; // 입사일자
	private String cdiRtmtDttm; // 퇴직일자
	private Date inptDttm; // 생성일시
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private String wrkIp; // IP

//    private GolfInfoDTO golfInfo;
//    private UserInfoDTO userInfo;

	public static CaddieInfoDTO toDto(CaddieInfo Ci) {
		CaddieInfoDTO caddieInfoDTO = new CaddieInfoDTO();
		caddieInfoDTO.setCdiSeq(Ci.getCdiSeq());
		caddieInfoDTO.setGiId(Ci.getGiId());
		caddieInfoDTO.setUiId(Ci.getUiId());
		caddieInfoDTO.setCdiName(Ci.getCdiName());
		caddieInfoDTO.setCdiGenderMf(Ci.getCdiGenderMf());
		caddieInfoDTO.setCdiResno(Ci.getCdiResno());
		caddieInfoDTO.setCdiPhone(Ci.getCdiPhone());
		caddieInfoDTO.setCdiGroup(Ci.getCdiGroup());
		caddieInfoDTO.setCdiType(Ci.getCdiType());
		caddieInfoDTO.setCdiPhoto(Ci.getCdiPhoto());
		caddieInfoDTO.setCdiAddr(Ci.getCdiAddr());
		caddieInfoDTO.setCdiAddrDesc(Ci.getCdiAddrDesc());
		caddieInfoDTO.setCdiZip(Ci.getCdiZip());
		caddieInfoDTO.setCdiFee(Ci.getCdiFee());
		caddieInfoDTO.setCdiCartNum(Ci.getCdiCartNum());
		caddieInfoDTO.setCdiJoinDttm(Ci.getCdiJoinDttm());
		caddieInfoDTO.setCdiRtmtDttm(Ci.getCdiRtmtDttm());
		caddieInfoDTO.setInptDttm(Ci.getInptDttm());
		caddieInfoDTO.setInptNbr(Ci.getInptNbr());
		caddieInfoDTO.setUpdtDttm(Ci.getUpdtDttm());
		caddieInfoDTO.setUpdtNbr(Ci.getUpdtNbr());
		caddieInfoDTO.setWrkIp(Ci.getWrkIp());
		return caddieInfoDTO;
	}

	public static CaddieInfo toEntity(CaddieInfoDTO dto) {
		CaddieInfo entity = new CaddieInfo();
		entity.setCdiSeq(dto.getCdiSeq());
		entity.setGiId(dto.getGiId());
		entity.setUiId(dto.getUiId());
		entity.setCdiName(dto.getCdiName());
		entity.setCdiGenderMf(dto.getCdiGenderMf());
		entity.setCdiResno(dto.getCdiResno());
		entity.setCdiPhone(dto.getCdiPhone());
		entity.setCdiGroup(dto.getCdiGroup());
		entity.setCdiType(dto.getCdiType());
		entity.setCdiPhoto(dto.getCdiPhoto());
		entity.setCdiAddr(dto.getCdiAddr());
		entity.setCdiAddrDesc(dto.getCdiAddrDesc());
		entity.setCdiZip(dto.getCdiZip());
		entity.setCdiFee(dto.getCdiFee());
		entity.setCdiCartNum(dto.getCdiCartNum());
		entity.setCdiJoinDttm(dto.getCdiJoinDttm());
		entity.setCdiRtmtDttm(dto.getCdiRtmtDttm());
		entity.setInptDttm(dto.getInptDttm());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setWrkIp(dto.getWrkIp());
		return entity;
	}

	// 추가된 메서드: 엔티티 업데이트를 위한 메서드
	public void updateEntity(CaddieInfo entity) {
		entity.setGiId(this.giId);
		entity.setUiId(this.uiId);
		entity.setCdiName(this.cdiName);
		entity.setCdiGenderMf(this.cdiGenderMf);
		entity.setCdiResno(this.cdiResno);
		entity.setCdiPhone(this.cdiPhone);
		entity.setCdiGroup(this.cdiGroup);
		entity.setCdiType(this.cdiType);
		entity.setCdiPhoto(this.cdiPhoto);
		entity.setCdiAddr(this.cdiAddr);
		entity.setCdiAddrDesc(this.cdiAddrDesc);
		entity.setCdiZip(this.cdiZip);
		entity.setCdiFee(this.cdiFee);
		entity.setCdiCartNum(this.cdiCartNum);
		entity.setCdiJoinDttm(this.cdiJoinDttm);
		entity.setCdiRtmtDttm(this.cdiRtmtDttm);
		entity.setUpdtDttm(new Date()); // 수정일시 업데이트
		entity.setUpdtNbr(this.updtNbr);
		entity.setWrkIp(this.wrkIp);
	}

}

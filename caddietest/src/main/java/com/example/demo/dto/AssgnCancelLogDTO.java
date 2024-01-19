package com.example.demo.dto;

import com.example.demo.entity.AssgnCancelLog;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class AssgnCancelLogDTO {

	private Long aclSeq; // 배정 취소 요청 시퀀스
	private Long giId; // 골프장 아이디
	private Integer craSeq; // 취소 요청한 배정 리스트 시퀀스
	private String aclDate; // 취소 요청한 배정 리스트 날짜
	private String aclTime; // 취소 요청한 배정 리스트 시간
	private String aclReqUiId; // 취소한 관리자 아이디
	private String aclRevUiId; // 취소 요청한 배정 리스트 배정 캐디
	private String aclReqType; // 취소 요청 타입 (0:예약취소,1:기상악화,2:기타)
	private String aclReqContent; // 취소 요청 내용
	private Date inptDttm; // 생성일시
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private String wrkIp; // IP

	public static AssgnCancelLogDTO toDto(AssgnCancelLog Acl) {
		AssgnCancelLogDTO assgnCancelLogDTO = new AssgnCancelLogDTO();
		assgnCancelLogDTO.setAclSeq(Acl.getAclSeq());
		assgnCancelLogDTO.setGiId(Acl.getGiId());
		assgnCancelLogDTO.setCraSeq(Acl.getCraSeq());
		assgnCancelLogDTO.setAclDate(Acl.getAclDate());
		assgnCancelLogDTO.setAclTime(Acl.getAclTime());
		assgnCancelLogDTO.setAclReqUiId(Acl.getAclReqUiId());
		assgnCancelLogDTO.setAclRevUiId(Acl.getAclRevUiId());
		assgnCancelLogDTO.setAclReqType(Acl.getAclReqType());
		assgnCancelLogDTO.setAclReqContent(Acl.getAclReqContent());
		assgnCancelLogDTO.setInptDttm(Acl.getInptDttm());
		assgnCancelLogDTO.setInptNbr(Acl.getInptNbr());
		assgnCancelLogDTO.setUpdtDttm(Acl.getUpdtDttm());
		assgnCancelLogDTO.setUpdtNbr(Acl.getUpdtNbr());
		assgnCancelLogDTO.setWrkIp(Acl.getWrkIp());
		return assgnCancelLogDTO;
	}

	public static AssgnCancelLog toEntity(AssgnCancelLogDTO dto) {
		AssgnCancelLog entity = new AssgnCancelLog();
		// AssgnCancelLog 엔티티에 필요한 값들을 dto에서 가져와서 설정
		entity.setAclSeq(dto.getAclSeq());
		entity.setGiId(dto.getGiId());
		entity.setCraSeq(dto.getCraSeq());
		entity.setAclDate(dto.getAclDate());
		entity.setAclTime(dto.getAclTime());
		entity.setAclReqUiId(dto.getAclReqUiId());
		entity.setAclRevUiId(dto.getAclRevUiId());
		entity.setAclReqType(dto.getAclReqType());
		entity.setAclReqContent(dto.getAclReqContent());
		entity.setInptDttm(dto.getInptDttm());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setWrkIp(dto.getWrkIp());
		return entity;
	}

	public void updateEntity(AssgnCancelLog entity) {
		entity.setGiId(this.giId);
		entity.setCraSeq(this.craSeq);
		entity.setAclDate(this.aclDate);
		entity.setAclTime(this.aclTime);
		entity.setAclReqUiId(this.aclReqUiId);
		entity.setAclRevUiId(this.aclRevUiId);
		entity.setAclReqType(this.aclReqType);
		entity.setAclReqContent(this.aclReqContent);
		entity.setUpdtDttm(new Date()); // 수정일시 업데이트
		entity.setUpdtNbr(this.updtNbr);
		entity.setWrkIp(this.wrkIp);
	}
}

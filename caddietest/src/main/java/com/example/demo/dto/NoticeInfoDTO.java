package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.NoticeInfo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NoticeInfoDTO {

	private Long niSeq; // 공지사항 정보 시퀀스
	private Long niGiId; // 골프장 코드 번호
	private String niUiRoleLevel; // 직급구분(무관-0,조원-1,조장-3,직원-5,일반관리자-7,상위관리자-8)
	private Long niId; // 공지사항 코드 번호
	private String niTitle; // 공지사항 제목
	private String niContent; // 공지사항의 내용을 저장하는 컬럼
	private Date inptDttm; // 생성일시
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private Boolean niIsActive; // 공지사항의 활성/비활성 상태를 나타내는 불리언(Boolean) 컬럼입니다.
	private Long niPriorityLevel; // 공지사항의 우선 순위를 나타내는 컬럼입니다.
	private String niAttachments; // 공지사항에 첨부된 파일이나 이미지의 경로 또는 링크를 저장하는 컬럼입니다.
	private Long niViews; // 조회수
	private String niWriter; // 공지사항 작성자

	public static NoticeInfoDTO toDto(NoticeInfo Ni) {
		NoticeInfoDTO noticeInfoDTO = new NoticeInfoDTO();
		noticeInfoDTO.setNiSeq(Ni.getNiSeq());
		noticeInfoDTO.setNiGiId(Ni.getNiGiId());
		noticeInfoDTO.setNiUiRoleLevel(Ni.getNiUiRoleLevel());
		noticeInfoDTO.setNiId(Ni.getNiId());
		noticeInfoDTO.setNiTitle(Ni.getNiTitle());
		noticeInfoDTO.setNiContent(Ni.getNiContent());
		noticeInfoDTO.setInptDttm(Ni.getInptDttm());
		noticeInfoDTO.setInptNbr(Ni.getInptNbr());
		noticeInfoDTO.setUpdtDttm(Ni.getUpdtDttm());
		noticeInfoDTO.setUpdtNbr(Ni.getUpdtNbr());
		noticeInfoDTO.setNiIsActive(Ni.getNiIsActive());
		noticeInfoDTO.setNiPriorityLevel(Ni.getNiPriorityLevel());
		noticeInfoDTO.setNiAttachments(Ni.getNiAttachments());
		noticeInfoDTO.setNiViews(Ni.getNiViews());
		noticeInfoDTO.setNiWriter(Ni.getNiWriter());
		return noticeInfoDTO;
	}

	public static NoticeInfo toEntity(NoticeInfoDTO dto) {
		NoticeInfo entity = new NoticeInfo();
		entity.setNiSeq(dto.getNiSeq());
		entity.setNiGiId(dto.getNiGiId());
		entity.setNiUiRoleLevel(dto.getNiUiRoleLevel());
		entity.setNiId(dto.getNiId());
		entity.setNiTitle(dto.getNiTitle());
		entity.setNiContent(dto.getNiContent());
		entity.setInptDttm(dto.getInptDttm());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setNiIsActive(dto.getNiIsActive());
		entity.setNiPriorityLevel(dto.getNiPriorityLevel());
		entity.setNiAttachments(dto.getNiAttachments());
		entity.setNiViews(dto.getNiViews());
		entity.setNiWriter(dto.getNiWriter());
		return entity;
	}

	public void updateEntity(NoticeInfo entity) {
		entity.setNiGiId(this.niGiId);
		entity.setNiUiRoleLevel(this.niUiRoleLevel);
		entity.setNiTitle(this.niTitle);
		entity.setNiContent(this.niContent);
		entity.setUpdtDttm(new Date());
		entity.setUpdtNbr(this.updtNbr);
		entity.setNiIsActive(this.niIsActive);
		entity.setNiPriorityLevel(this.niPriorityLevel);
		entity.setNiAttachments(this.niAttachments);
		entity.setNiViews(this.niViews);
		entity.setNiWriter(this.niWriter);
	}
}
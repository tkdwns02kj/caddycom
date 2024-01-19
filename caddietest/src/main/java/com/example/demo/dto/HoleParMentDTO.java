package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.HoleParMent;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HoleParMentDTO {

	private Long hpmSeq; // 홀파 정보 시퀀스
	private Long clHpmcourseId; // 코스 아이디
	private Long hpmGiId; // 골프장 코드 번호
	private Long hpiHoleId; // 홀 번호(ID)
	private Long hpiParId; // 파 번호(ID)
	private String hpmInfoMent; // 안내 멘트
	private String hpmBunkerMent; // 벙커 멘트
	private String hpmGreenMent; // 그린 멘트
	private String hpmTipType; // 팁 타입(1:코스공략, 2:아이피,3:기타)
	private Date inptDttm; // 입력일자
	// 여기는 왜 입력자와 수정자가 없는가
	private Date updtDttm; // 수정일자
	private String mOs; // 구분 AOS, IOS

	public static HoleParMentDTO toDto(HoleParMent Hpm) {
		HoleParMentDTO holeParMentDTO = new HoleParMentDTO();
		holeParMentDTO.setHpmSeq(Hpm.getHpmSeq());
		holeParMentDTO.setClHpmcourseId(Hpm.getClHpmcourseId());
		holeParMentDTO.setHpmGiId(Hpm.getHpmGiId());
		holeParMentDTO.setHpiHoleId(Hpm.getHpiHoleId());
		holeParMentDTO.setHpiParId(Hpm.getHpiParId());
		holeParMentDTO.setHpmInfoMent(Hpm.getHpmInfoMent());
		holeParMentDTO.setHpmBunkerMent(Hpm.getHpmBunkerMent());
		holeParMentDTO.setHpmGreenMent(Hpm.getHpmGreenMent());
		holeParMentDTO.setHpmTipType(Hpm.getHpmTipType());
		holeParMentDTO.setInptDttm(Hpm.getInptDttm());
		holeParMentDTO.setUpdtDttm(Hpm.getUpdtDttm());
		holeParMentDTO.setMOs(Hpm.getMOs());
		return holeParMentDTO;
	}

	public static HoleParMent toEntity(HoleParMentDTO dto) {
		HoleParMent entity = new HoleParMent();
		entity.setHpmSeq(dto.getHpmSeq());
		entity.setClHpmcourseId(dto.getClHpmcourseId());
		entity.setHpmGiId(dto.getHpmGiId());
		entity.setHpiHoleId(dto.getHpiHoleId());
		entity.setHpiParId(dto.getHpiParId());
		entity.setHpmInfoMent(dto.getHpmInfoMent());
		entity.setHpmBunkerMent(dto.getHpmBunkerMent());
		entity.setHpmGreenMent(dto.getHpmGreenMent());
		entity.setHpmTipType(dto.getHpmTipType());
		entity.setInptDttm(dto.getInptDttm());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setMOs(dto.getMOs());
		return entity;
	}

	public void updateEntity(HoleParMent entity) {
		entity.setClHpmcourseId(this.clHpmcourseId);
		entity.setHpmGiId(this.hpmGiId);
		entity.setHpiHoleId(this.hpiHoleId);
		entity.setHpiParId(this.hpiParId);
		entity.setHpmInfoMent(this.hpmInfoMent);
		entity.setHpmBunkerMent(this.hpmBunkerMent);
		entity.setHpmGreenMent(this.hpmGreenMent);
		entity.setHpmTipType(this.hpmTipType);
		entity.setInptDttm(this.inptDttm);
		entity.setUpdtDttm(new Date());
		entity.setMOs(this.mOs);
	}

}

package com.example.demo.dto;

import java.util.Date;

import com.example.demo.entity.AssgnOpenDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AssgnOpenDateDTO {

	private Long aodSeq; // 배정 리스트 오픈 날짜 시퀀스
	private Long giId; // 골프장 아이디
	private Integer aodHouse; // 하우스 캐디 오픈 날짜
	private Integer aodMaster; // 마스터 캐디 오픈 날짜
	private String aodMasterYn; // 마스터 캐디 사용 유무
	private Date inptDttm; // 생성일시
	private String inptNbr; // 생성자
	private Date updtDttm; // 수정일시
	private String updtNbr; // 수정자
	private String wrkIp; // IP

	// 추가된 부분: 외래키에 대한 GolfInfoDTO 참조
//    private GolfInfoDTO golfInfo; // 골프장 정보

	// 필요에 따라 추가적인 매핑 설정을 할 수 있습니다.
	public static AssgnOpenDateDTO toDto(AssgnOpenDate Aot) {
		AssgnOpenDateDTO assgnOpenDateDTO = new AssgnOpenDateDTO();
		assgnOpenDateDTO.setAodSeq(Aot.getAodSeq());
		assgnOpenDateDTO.setGiId(Aot.getGiId());
		assgnOpenDateDTO.setAodHouse(Aot.getAodHouse());
		assgnOpenDateDTO.setAodMaster(Aot.getAodMaster());
		assgnOpenDateDTO.setAodMasterYn(Aot.getAodMasterYn());
		assgnOpenDateDTO.setInptDttm(Aot.getInptDttm());
		assgnOpenDateDTO.setInptNbr(Aot.getInptNbr());
		assgnOpenDateDTO.setUpdtDttm(Aot.getUpdtDttm());
		assgnOpenDateDTO.setUpdtNbr(Aot.getUpdtNbr());
		assgnOpenDateDTO.setWrkIp(Aot.getWrkIp());
		return assgnOpenDateDTO;
	}

	public static AssgnOpenDate toEntity(AssgnOpenDateDTO dto) {
		AssgnOpenDate entity = new AssgnOpenDate();
		entity.setAodSeq(dto.getAodSeq());
		entity.setGiId(dto.getGiId());
		entity.setAodHouse(dto.getAodHouse());
		entity.setAodMaster(dto.getAodMaster());
		entity.setAodMasterYn(dto.getAodMasterYn());
		entity.setInptDttm(dto.getInptDttm());
		entity.setInptNbr(dto.getInptNbr());
		entity.setUpdtDttm(dto.getUpdtDttm());
		entity.setUpdtNbr(dto.getUpdtNbr());
		entity.setWrkIp(dto.getWrkIp());
		return entity;
	}

	public void updateEntity(AssgnOpenDate entity) {
		entity.setGiId(this.giId);
		entity.setAodHouse(this.aodHouse);
		entity.setAodMaster(this.aodMaster);
		entity.setAodMasterYn(this.aodMasterYn);
		entity.setUpdtDttm(new Date()); // 수정일시 업데이트
		entity.setUpdtNbr(this.updtNbr);
		entity.setWrkIp(this.wrkIp);
	}
}

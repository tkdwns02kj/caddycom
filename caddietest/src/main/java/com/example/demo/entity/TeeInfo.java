package com.example.demo.entity;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "tee_info")
public class TeeInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TI_SEQ", nullable = false)
	private Long tiSeq; // TEE 정보 시퀀스

	@Column(name = "TI_TEE_ID", nullable = false, length = 45)
	private String tiTeeId; // 티 번호

	@Column(name = "HPI_HOLE_ID", nullable = false)
	private Long hpiHoleId; // 홀 번호(ID)

	@Column(name = "HPI_PAR_ID", nullable = false)
	private Long hpiParId; // 파 번호(ID)

	@Column(name = "TI_TEE_NAME", length = 45)
	private String tiTeeName; // TEE 이름

	@Column(name = "TI_M", length = 45)
	private String tiM; // M 미터

	@Column(name = "TI_YARD", length = 45)
	private String tiYard; // YARD 야드

	@Column(name = "TI_M_SUBTOTAL")
	private Long tiMSubtotal; // M 소계

	@Column(name = "TI_YARD_SUBTOTAL")
	private Long tiYardSubtotal; // YARD 소계

	@Column(name = "TI_M_TOTAL")
	private Long tiMTotal; // M 합계

	@Column(name = "TI_YARD_TOTAL")
	private Long tiYardTotal; // YARD 합계

	@Column(name = "HPI_PAR_SUBTOTAL")
	private Long hpiParSubtotal; // HPI 파 소계

	@Column(name = "HPI_PAR_TOTAL")
	private Long hpiParTotal; // HPI 파 합계

}

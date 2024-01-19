package com.example.demo.service;

import com.example.demo.dto.UserInfoDTO;
import com.example.demo.entity.UserInfo;
import com.example.demo.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserInfoService {

	private final UserInfoRepository userInfoRepository;

	/**
	 * 모든 사용자 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public List<UserInfoDTO> getAllUserInfoDTOs() {
		List<UserInfo> userInfos = userInfoRepository.findAll();
		return userInfos.stream().map(UserInfoDTO::toDto).collect(Collectors.toList());
	}

	/**
	 * 특정 사용자 정보 시퀀스를 가져오는 메서드
	 */
	@Transactional
	public UserInfoDTO getUserInfoDTOById(Long uiSeq) {
		return userInfoRepository.findById(uiSeq).map(UserInfoDTO::toDto).orElse(null);
	}

	/**
	 * 새로운 사용자 정보 시퀀스를 생성하는 메서드
	 */
	@Transactional
	public UserInfoDTO createUserInfo(UserInfoDTO userInfoDTO) {
		UserInfo userInfo = UserInfoDTO.toEntity(userInfoDTO);
		UserInfo savedLog = userInfoRepository.save(userInfo);
		return UserInfoDTO.toDto(savedLog);
	}

	/**
	 * 특정 사용자 정보 시퀀스를 업데이트하는 메서드
	 */
	@Transactional
	public UserInfoDTO updateUserInfo(Long uiSeq, UserInfoDTO updatedLogDTO) {
		return userInfoRepository.findById(uiSeq).map(existingLog -> {
			updatedLogDTO.updateEntity(existingLog); // 엔티티 업데이트 메서드 호출
			UserInfo updatedLog = userInfoRepository.save(existingLog);
			return UserInfoDTO.toDto(updatedLog);
		}).orElse(null);
	}

	/**
	 * 특정 사용자 정보 시퀀스를 삭제하는 메서드
	 */
	@Transactional
	public void deleteUserInfo(Long uiSeq) {
		userInfoRepository.deleteById(uiSeq);
	}
}
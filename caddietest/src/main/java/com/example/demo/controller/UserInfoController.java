package com.example.demo.controller;

import com.example.demo.dto.UserInfoDTO;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user-infos")
public class UserInfoController {

	private final UserInfoService userInfoService;

	/**
	 * 모든 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping
	public List<UserInfoDTO> getAllUserInfos() {
		return userInfoService.getAllUserInfoDTOs();
	}

	/**
	 * 특정 배정 취소 로그를 가져오는 엔드포인트
	 */
	@GetMapping("/{uiSeq}")
	public UserInfoDTO getUserInfoById(@PathVariable Long uiSeq) {
		return userInfoService.getUserInfoDTOById(uiSeq);
	}

	/**
	 * 새로운 배정 취소 로그를 생성하는 엔드포인트
	 */
	@PostMapping
	public UserInfoDTO createUserInfo(@RequestBody UserInfoDTO userInfoDTO) {
		return userInfoService.createUserInfo(userInfoDTO);
	}

	/**
	 * 기존 배정 취소 로그를 업데이트하는 엔드포인트
	 */
	@PutMapping("/{uiSeq}")
	public UserInfoDTO updateUserInfo(@PathVariable Long uiSeq,
			@RequestBody UserInfoDTO updatedLogDTO) {
		return userInfoService.updateUserInfo(uiSeq, updatedLogDTO);
	}

	/**
	 * 특정 배정 취소 로그를 삭제하는 엔드포인트
	 */
	@DeleteMapping("/{uiSeq}")
	public void deleteUserInfo(@PathVariable Long uiSeq) {
		userInfoService.deleteUserInfo(uiSeq);
	}
	
	@GetMapping("/getUsername")
	public ResponseEntity<UserInfoDTO> getUsername(HttpSession session) {
	    UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
	    if (userInfo != null) {
	        UserInfoDTO userInfoDTO = new UserInfoDTO();
	        // 여기서 UserInfoDTO에 필요한 정보를 담아 전달합니다.
	        userInfoDTO.setUiName(userInfo.getUiName());
	        userInfoDTO.setUiRoleType(userInfo.getUiRoleType());
	        // 다른 정보들도 필요에 따라 추가

	        return new ResponseEntity<>(userInfoDTO, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	    }
	}
}

package com.example.demo.service;

import com.example.demo.entity.UserInfo;
import com.example.demo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

	@Autowired
	private UserInfoRepository userInfoRepository;

	public UserInfo getUserInfoByUiId(String uiId) {
		Optional<UserInfo> userInfoOptional = userInfoRepository.findByUiId(uiId);
		return userInfoOptional.orElse(null);
	}
}

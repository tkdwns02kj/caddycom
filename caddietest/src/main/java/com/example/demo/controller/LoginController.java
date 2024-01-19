package com.example.demo.controller;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.LoginService;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest, HttpSession session) {
        // loginRequest 객체 사용
        String uiId = loginRequest.getUiId();

        // 나머지 로그인 처리 로직
        // 예시로 사용자 서비스에서 아이디로 사용자 정보를 가져오는 메소드를 호출
        UserInfo userInfo = loginService.getUserInfoByUiId(loginRequest.getUiId());

        // 사용자 정보가 없으면 로그인 실패
        if (userInfo != null) {
            // 세션에 사용자 정보 저장
            session.setAttribute("userInfo", userInfo);
            return new ResponseEntity<>("Login Successful: " + userInfo.getUiName(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Login Failed", HttpStatus.UNAUTHORIZED);
        }
    }
}

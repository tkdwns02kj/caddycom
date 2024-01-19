package com.example.demo.controller;

import lombok.Data;

@Data
public class LoginRequest {

    private String uiId;

    // 기본 생성자 추가
    public LoginRequest() {
    }

    // 인자를 받는 생성자 추가
    public LoginRequest(String uiId) {
        this.uiId = uiId;
    }
}

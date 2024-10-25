package com.example.test.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/user")  // 클래스 레벨에서 /user 경로 추가

public class Controller {
    @GetMapping("/test")
    public String signUp(){
        return "hi";
    }




}
package com.example.firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        //모델 객체가 "이경선" 값을 "username"에 연결해 웹 브라우저로 보냄
        model.addAttribute("username","아무개");
        return "greetings"; //greetings.mustache 파일 변환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname","아무개");
        return "goodbye";
    }

}

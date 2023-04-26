package com.icia.test.controller;

import com.icia.test.dto.MemberDTO;
import com.icia.test.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;
    @GetMapping("/")
    public String index() {
    return "index";
    }

    @GetMapping("/member")
    public String member() {
        return "member";
    }

    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO, Model model) {
        int saveResult = memberService.save(memberDTO);
        model.addAttribute("result",saveResult);
        return "memberResult";

    }





}

package com.icia.test.controller;

import com.icia.test.dto.MemberDTO;
import com.icia.test.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;
    @GetMapping("/")
    public String index() {
    return "index";
    }


    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO, Model model) {
        int saveResult = memberService.save(memberDTO);
        model.addAttribute("result",saveResult);
        return "saveResult";

    }

    @GetMapping("/list")
    public String findAll(Model model) {
        List<MemberDTO> memberDTOList = memberService.findAll();
        for(MemberDTO memberDTO:memberDTOList) {
            System.out.println("memberDTO = " + memberDTO);
        }
        model.addAttribute("memberList", memberDTOList);
        return "list";
    }

    @GetMapping("/detail")
    public String findById(@RequestParam("custno")Long custno, Model model) {
        MemberDTO memberDTO = memberService.findById(custno);
        model.addAttribute("member",memberDTO);
        return "detail";
    }





}

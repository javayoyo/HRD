package com.icia.test.service;

import com.icia.test.dto.MemberDTO;
import com.icia.test.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;


    public int save(MemberDTO memberDTO) {
        System.out.println("memberDTO = " + memberDTO);
        int result = memberRepository.save(memberDTO);
        return result;

    }



}

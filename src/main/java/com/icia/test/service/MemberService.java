package com.icia.test.service;

import com.icia.test.dto.MemberDTO;
import com.icia.test.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;


    public boolean save(MemberDTO memberDTO) {
       return  memberRepository.save(memberDTO);
    }

    public List<MemberDTO> findAll() {
        return memberRepository.findAll();
    }

    public MemberDTO findById(Long custno) {
        return memberRepository.findById(custno);
    }

    public void update(MemberDTO memberDTO) {
        memberRepository.update(memberDTO);
    }


}

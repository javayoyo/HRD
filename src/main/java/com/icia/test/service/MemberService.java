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


    public int save(MemberDTO memberDTO) {
        System.out.println("memberDTO = " + memberDTO);
        int result = memberRepository.save(memberDTO);
        return result;

    }

    public List<MemberDTO> findAll() {
    List<MemberDTO> memberDTOList = memberRepository.findAll();
    if(memberDTOList.size() == 0) {
        return null;
    }else {
        return memberDTOList;
    }
    }

    public MemberDTO findById(Long custno) {
        return memberRepository.findById(custno);
    }



}

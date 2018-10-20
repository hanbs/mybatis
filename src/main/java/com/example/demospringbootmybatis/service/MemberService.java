//package com.example.demospringbootmybatis.service;
//
//import com.example.demospringbootmybatis.dto.MemberDTO;
//import com.example.demospringbootmybatis.repository.MemberRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//@Transactional
//public class MemberService {
//
//    @Autowired
//    MemberRepository repository;
//
////    public List<MemberDTO> getMember(){
////        return repository.getMember();
//
//    public MemberDTO selectLogin(String UserId, String UserPw){
//
//        Map<String, String> map = new HashMap<>();
//        map.put("UserId", UserId);
//        map.put("UserPw", UserPw);
//
//        return repository.selectLogin(UserId, UserPw);
//    }
//}
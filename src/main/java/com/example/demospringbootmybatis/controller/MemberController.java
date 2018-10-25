//package com.example.demospringbootmybatis.controller;
//
//import com.example.demospringbootmybatis.dto.MemberDTO;
//import com.example.demospringbootmybatis.service.MemberService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import javax.servlet.http.HttpSession;
//
//@Controller
//public class MemberController {
//
//    @Autowired
//    public MemberService memberService;
//
//    Logger logger = LoggerFactory.getLogger(getClass()); // logging 하기 위해 지정
//
//    // 메인화면
//    @GetMapping(value = {"/", "/brian", "han"}) // 처음 url에 /나 brian이라고 받으면 main.html로 리턴.
//    public String index() {
//
//        logger.info(">>>>>>>>> 메인 화면 입니다. >>>>>>>>");
//
//    return "client/main";
//    }
//
//    // 로그인 페이지 이동
//    @GetMapping(value = "/login_g")
//    public String login_g() {
//        logger.info(">>>>>>> 로그인 페이지로 이동 >>>>>>>>");
//        return "client/login";
//    }
//
//    // 로그인 처리
//    @PostMapping(value = "/login_s")
//    public String login_s(MemberDTO dto, Model model, HttpSession session){
//        logger.info(">>>>>>> 로그인 중... >>>>>>>");
//
//    String UserId = dto.getUserId();
//    String UserPw = dto.getUserPw();
//
//    MemberDTO resultDTO = memberService.selectLogin(UserId,UserPw);
//
//        if (dto.getUserId() != null){
//            session.setAttribute("UserId", dto.getUserId());
//        } else {
//            model.addAttribute("UserId", UserId);
//            return "client/login";
//        }
//        return "client/main";
//    }
//
////    @RequestMapping(value = "/brian", method = RequestMethod.GET)
////    public String getMember(Model model, HttpRequest request) {
////        logger.info(">>>>>>>> 메인 화면 입니다. >>>>>>>>>");
////        model.addAttribute("select", memberService.getMember());
////        return "main";
////         }
//}
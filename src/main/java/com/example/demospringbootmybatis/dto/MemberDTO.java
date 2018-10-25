//package com.example.demospringbootmybatis.dto;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.apache.ibatis.type.Alias;
//
//@Data
//@Alias("tr_member")
//public class MemberDTO { //JPA는 Mybatis를 쓰기 때문에 제외 시켰다.
//
//    private String User_Id; // 아이디 primary key
//    private String User_Pw; // 비밀번호
//    private String User_Name; // 이름
//    private String User_Email; // 이메일
//    private String User_Phone; // 전화번호
//    private String User_Addr; // 주소
//
//
//    // 생성자는 @NoArgsConstructor나 @AllArgsConstructor로 만들어도 된다.
//
//    public MemberDTO() {
//    }
//
//    public MemberDTO(String User_Id, String User_Pw, String User_Name, String User_Email, String User_Phone, String User_Addr) {
//        this.User_Id = User_Id;
//        this.User_Pw = User_Pw;
//        this.User_Name = User_Name;
//        this.User_Email = User_Email;
//        this.User_Phone = User_Phone;
//        this.User_Addr = User_Addr;
//    }
//
//}
package com.example.demospringbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 설명: http://tech.javacafe.io/2018/07/31/mybatis-with-spring/
// github: https://github.com/JAVACAFE-STUDY/mybatis-sample
@SpringBootApplication

// <context:component-scan과 유사하다.
// 지정한 경로에서 @Mapper를 탐색한다.
@MapperScan(basePackages = "com.example.demospringbootmybatis.repository")
public class DemoSpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootMybatisApplication.class, args);
    }
}

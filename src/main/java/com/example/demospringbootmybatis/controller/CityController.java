package com.example.demospringbootmybatis.controller;

import com.example.demospringbootmybatis.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CityController {

    // database -> dto
    // service -> dto -> controller -> vo -> view

    // model : data entity
    // dao :  database access select, update, insert
    // service : dao 를가지고 비즈니스 로직 짜는것
    // controller : 1.2.3. service 주입 -> dto 3개 -> 하나로 모아서 던져주는것
    // view : foreach, if 표현 html 로 표현 구사

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private CityService cityService;

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public ModelAndView selectNamePost(){//@RequestParam String name) { //throws Exception{ // 계산이라던가, IO Exception에만 쓰는 것.

        ModelAndView mv = new ModelAndView();

        //log.info(">>>>>>>>>>>>>>" + name);

        // City, Member, Addr
        // ViewItemVo = City + Member + Addr

        mv.setViewName("test/test"); // 뷰 이름을 설정

        mv.addObject("id", cityService.getAllCity()); // ("변수이름", 데이터값);

        //log.info(cityService.getCityById("").toString());

        //System.out.println(">>>>>>>>>>>>>>>>>>>>>>" + cityService.getCityById(name)); // 제대로 잘 넘어옴.

        return mv;
    }
}
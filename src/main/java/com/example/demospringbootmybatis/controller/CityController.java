package com.example.demospringbootmybatis.controller;

import com.example.demospringbootmybatis.dto.City;
import com.example.demospringbootmybatis.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CityController {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/")
    public ModelAndView selectNamePost(Model model, String name) throws Exception{

        ModelAndView mv = new ModelAndView();
        mv.addObject("test", cityService.getCityById(name));

        System.out.println(name);
        mv.setViewName("test/test");

        return mv;
    }
}

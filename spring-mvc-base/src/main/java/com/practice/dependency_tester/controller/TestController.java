package com.practice.dependency_tester.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.idc.querytool.rest.client.api.QTRestClientService;

@Controller
public class TestController {

    @Autowired
    private QTRestClientService qtRestClientService;

    @RequestMapping("/test")
    public ModelAndView testApp() {
//        System.out.println(qtRestClientService.getAllQTDataSets());
        return new ModelAndView("hello");
    }
}

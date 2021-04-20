package com.current.highcurrency.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class testController {


    @RequestMapping("/test")
    @ResponseBody
    public String test(){

        return "hello spring";
    }

    public static void main(String[] args) {
        System.out.println("测试----");
    }

}

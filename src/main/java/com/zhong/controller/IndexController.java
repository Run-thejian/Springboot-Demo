package com.zhong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：zhongjianyi
 * @description：TODO
 * @date ：2023-10-20 10:14
 */

//在templates目录下的所有页面，只能通过controller来跳转
//这个需要模板引擎的支持！thymeleaf

@Controller
public class IndexController {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","hello,springboot");
//        model.addAttribute("msg","<h1>hello,springboot</h1>");

        return "test";
    }
}

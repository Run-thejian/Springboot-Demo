package com.zhong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zhongjianyi
 * @description：TODO
 * @date ：2023-10-19 15:28
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,world!";
    }
}

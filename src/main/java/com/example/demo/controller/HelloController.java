package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * @Author wenbaoxie
 * @Date 2020/9/17
 */
@Slf4j
@Controller
public class HelloController {
    public static int i = 1;
    @RequestMapping("/")
    public String index(){
        System.out.println("首页");
        log.info("访问次数: {} 时间:{}" ,i++, LocalDateTime.now());
        return "index.html";
    }

}

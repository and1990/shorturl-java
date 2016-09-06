package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注释：
 * 作者：刘腾飞【liutengfei】
 * 时间：2016年09月06日 17:19
 */
@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping("helloworld")
    @ResponseBody
    public String helloWorld() {
        return "hello world";
    }
}

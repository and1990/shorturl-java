package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注释：短连接controller
 * 作者：刘腾飞【liutengfei】
 * 时间：2016年09月06日 18:25
 */
@Controller
@RequestMapping("/")
public class ShortUrlController {
    /**
     * 获取短URL
     *
     * @param url 长连接
     * @return
     */
    @ResponseBody
    @RequestMapping("short")
    public String getShortURL(String url) {
        return "1212";
    }

    /**
     * 获取长URL
     *
     * @param shortURL 短连接
     * @return
     */
    @ResponseBody
    @RequestMapping("/{shortURL}")
    public String getLongURL(@PathVariable String shortURL) {
        return "URL is " + shortURL;
    }
}

package com.cn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2019/9/3 0003 15:06
 */
@RestController
@RequestMapping("/native")
public class NativeConfigClientHandler {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;


    @GetMapping("config")
    public String config() {
        return this.port + this.foo;
    }

}

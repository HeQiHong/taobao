package com.cn.controller;

import com.cn.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2019/9/3 0003 11:58
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }

}

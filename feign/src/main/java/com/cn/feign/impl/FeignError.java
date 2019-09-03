package com.cn.feign.impl;

import com.cn.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2019/9/3 0003 12:15
 */
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public String index() {
        return "服务器维护中....";
    }
}

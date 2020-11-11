package com.pll.springboot.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.pll.springboot.dubbo.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}

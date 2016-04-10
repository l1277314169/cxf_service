package com.service.impl;


import com.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016-04-10.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
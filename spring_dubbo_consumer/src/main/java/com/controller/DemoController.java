package com.controller;

import com.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016-04-10.
 */
@Controller
@RequestMapping("/demoController")
public class DemoController {

    @Autowired
    private DemoService demoService;
    @RequestMapping("/show")
    public  void show(){
        String aa = demoService.sayHello("aa");
        System.out.println("ff"+aa);
    }
}

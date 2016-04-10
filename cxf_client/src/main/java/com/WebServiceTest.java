package com;

import com.test.ws.service.WSTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.annotation.Resources;


/**
 * Created by Administrator on 2016-04-10.
 */
@Controller
@RequestMapping(value = "/weServiceTest")
public class WebServiceTest {
    @Resource(name = "wsTestClinetBean")
    private WSTestService wsTestServicel;

    @RequestMapping(value = "/show")
    public void show(){
        String aa = wsTestServicel.getSomething("aa");
        System.out.println("bb"+aa);
    }
}

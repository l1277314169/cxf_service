package com;

import com.test.ws.service.WSTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Administrator on 2016-04-10.
 */
@Controller
@RequestMapping(value = "/weServiceTest")
public class WebServiceTest {
    @Autowired
    private WSTestService wsTestServicel;

    @RequestMapping(value = "/show")
    public void show(){
        wsTestServicel.getSomething("aa");
        System.out.println("bb");
    }
}

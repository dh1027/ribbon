package com.dh1027.springclound.ribbon.controller;

import com.dh1027.springclound.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by heyj2 on 2018/6/28.
 */
@Controller
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    @ResponseBody
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}

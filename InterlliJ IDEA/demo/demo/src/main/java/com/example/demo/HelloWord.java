package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @RequestMapping(value = "/hello")
    public String index(){
        return  "hello word!";
    }

    @RequestMapping(value = "/index/getName")
    public String getName(String name,String password){
        return "世界卫生组织"+name+password;
    }
}



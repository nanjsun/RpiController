package com.loiserver.picontrollerjava;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String index() {

        return "Hello World!";
    }

    @RequestMapping("/hi")
    public String hi() {

        return "hi!!";
    }


}

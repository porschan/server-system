package com.chanchifeng.serversystem.ctrl;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:porschan
 * @description:
 * @date: Created in 10:14 2018/6/15
 * @modified By:
 */

@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        System.out.println("进入controller");
        return "Hello World!";
    }
}

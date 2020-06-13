package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述TODO:
 * @author: Mr.Cui
 * @create: 2020-06-13 10:58
 **/
@RestController
public class TestController {

    @GetMapping("/get")
    public String test() {
        return "hello world";
    }

}

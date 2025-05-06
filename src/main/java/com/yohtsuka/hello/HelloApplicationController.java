package com.yohtsuka.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApplicationController {

    @RequestMapping("/")
    public String test() {
        return "Hello World";
    }
    // paramやメソッドを指定する場合（GET）
    @RequestMapping(value="/test", method=RequestMethod.GET, headers="Accept=application/*", params="id=002")
    public String testWithId() {
        return "Test with ID 002";
    } 
}
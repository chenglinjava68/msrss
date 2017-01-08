package com.jeuduizone.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: JamieXu
 * Time: 2017/1/8 下午6:09
 */
@RestController
@RequestMapping(value = "hello")
public class HelloWordController {

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable String name){
        return "hello:"+name;
    }
}

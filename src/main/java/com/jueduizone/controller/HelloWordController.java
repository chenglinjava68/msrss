package com.jueduizone.controller;

import com.jueduizone.model.PuTian;
import com.jueduizone.service.PuTianServie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * User: JamieXu
 * Time: 2017/1/8 下午6:09
 */
@RestController
@RequestMapping(value = "hello")
public class HelloWordController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PuTianServie putianService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Map<String,Object> hello(@PathVariable int id){
        Map<String,Object> returnMap = new HashMap<String,Object>();
        PuTian puTian = putianService.getInfoById(id, "1");
        if(null != puTian){
            returnMap.put("code","200");
            returnMap.put("putian",puTian);
        }else{
            returnMap.put("code","400");
            returnMap.put("message", "抱歉,没有相应的信息!");
        }
        //将对象转换为json字符串返回
        return returnMap;
    }
}

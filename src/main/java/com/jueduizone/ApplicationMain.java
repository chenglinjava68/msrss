package com.jueduizone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * SpringBoot 程序入口 主方法
 * Created by JamieXu on 2017/1/4 0004.
 */
@SpringBootApplication
@MapperScan("com.jueduizone.dao")
public class ApplicationMain {
    public static void main(String[] args){
        SpringApplication.run(ApplicationMain.class,args);
    }
}

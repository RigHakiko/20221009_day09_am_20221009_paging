package com.group6.mp1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.group6.mp1.mapper")
public class Day09Am20221009PagingApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day09Am20221009PagingApplication.class, args);
    }

}

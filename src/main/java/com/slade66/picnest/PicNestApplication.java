package com.slade66.picnest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.slade66.picnest.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class PicNestApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(PicNestApplication.class, args);
    }

}

package com.fromZero.zeroDesign;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan(basePackages = "com.fromZero.zeroDesign.dao")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class DesignModeApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(DesignModeApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

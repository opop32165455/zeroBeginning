package com.fromzero.zerobeginning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.fromzero.zerobeginning.dao")
public class JsonSchemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonSchemaApplication.class, args);
    }

}

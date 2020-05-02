package com.hjs.microserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.hjs.microserver.mapper")
@EnableDiscoveryClient
public class MicroHrApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroHrApplication.class, args);
    }

}

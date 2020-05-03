package com.hjs.microserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.hjs.microserver.mapper")
@EnableDiscoveryClient
@EnableFeignClients
public class MicroPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroPortalApplication.class, args);
    }

}

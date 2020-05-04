package com.hjs.eurekaclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EurekaClientApplicationTests {

    @Test
    void contextLoads() {
    }

    @Value("${author}")
    private String author;

    @Test
    public void testConfig(){
        System.out.println(author);
    }

}

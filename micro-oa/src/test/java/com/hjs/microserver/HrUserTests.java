package com.hjs.microserver;

import com.hjs.microserver.service.hr.HrUserClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HrUserTests {

    @Autowired
    private HrUserClient hrUserClient;

    @Test
    public void testUsers(){
        System.out.println(hrUserClient.listUsers());
    }

}

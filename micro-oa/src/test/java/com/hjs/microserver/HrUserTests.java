package com.hjs.microserver;

import com.hjs.microserver.common.view.JsonResult;
import com.hjs.microserver.entity.vo.SysUserVO;
import com.hjs.microserver.feign.client.HrUserClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class HrUserTests {

    @Autowired
    private HrUserClient hrUserClient;

    @Test
    public void testUsers(){
        JsonResult<List<SysUserVO>> result = hrUserClient.listUsers();

        List<SysUserVO> list = result.getData();
        list.forEach(obj -> {
            System.out.println(obj.getUserName());
        });
    }


    @Test
    public void testUser(){
        JsonResult<SysUserVO> result = hrUserClient.queryById("jianshuang_huang");
        System.out.println(result.getData());
    }

}

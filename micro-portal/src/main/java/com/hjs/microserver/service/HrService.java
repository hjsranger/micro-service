package com.hjs.microserver.service;

import com.hjs.microserver.common.view.JsonResult;
import com.hjs.microserver.entity.SysUserVO;
import com.hjs.microserver.service.client.HrClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrService {

    @Autowired
    private HrClient hrClient;

    /**
     * 获取所有用户
     * @return
     */
    public List<SysUserVO> listUsers(){
        JsonResult<List<SysUserVO>> result = hrClient.listUsers();
        if(result.isSuccess()){
            return result.getData();
        }
        return null;
    }

    /**
     * 根据Id查询用户信息
     * @param account
     * @return
     */
    public SysUserVO queryById(String account){
        JsonResult<SysUserVO> result = hrClient.queryById(account);
        if(result.isSuccess()){
            return result.getData();
        }
        return null;
    }

}

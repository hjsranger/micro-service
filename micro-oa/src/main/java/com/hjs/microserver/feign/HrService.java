package com.hjs.microserver.feign;

import com.hjs.microserver.common.view.JsonResult;
import com.hjs.microserver.entity.vo.SysUserVO;
import com.hjs.microserver.feign.client.HrUserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class HrService {

    @Autowired
    private HrUserClient hrUserClient;

    /**
     * 获取所有用户
     * @return
     */
    public List<SysUserVO> listUsers(){
        JsonResult<List<SysUserVO>> result = hrUserClient.listUsers();
        if(result.isSuccess()){
            return result.getData();
        }
        return null;
    };

    /**
     * 根据Id查询用户信息
     * @param account
     * @return
     */
    public SysUserVO queryById(String account){
        JsonResult<SysUserVO> result = hrUserClient.queryById(account);
        if(result.isSuccess()){
            return result.getData();
        }
        return null;
    };

}

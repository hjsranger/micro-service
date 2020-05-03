package com.hjs.microserver.service;

import com.hjs.microserver.common.view.JsonResult;
import com.hjs.microserver.entity.LeaveInfoVO;
import com.hjs.microserver.entity.SysUserVO;
import com.hjs.microserver.service.client.DataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private DataClient dataClient;

    /**
     * 获取所有用户
     * @return
     */
    public List<SysUserVO> listUsers(){
        JsonResult<List<SysUserVO>> result = dataClient.listUsers();
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
        JsonResult<SysUserVO> result = dataClient.queryById(account);
        if(result.isSuccess()){
            return result.getData();
        }
        return null;
    }

    /**
     * 查询假期申请List
     * @return
     */
    public List<LeaveInfoVO> queryLeaveInfoList(){
        JsonResult<List<LeaveInfoVO>> result = dataClient.queryLeaveInfoList();
        if(result.isSuccess()){
            return result.getData();
        }
        return null;
    }

}

package com.hjs.microserver.service;

import com.hjs.microserver.common.view.JsonResult;
import com.hjs.microserver.entity.LeaveInfoVO;
import com.hjs.microserver.service.client.OaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OaService {

    @Autowired
    private OaClient oaClient;

    /**
     * 查询假期申请List
     * @return
     */
    public List<LeaveInfoVO> queryLeaveInfoList(){
        JsonResult<List<LeaveInfoVO>> result = oaClient.queryLeaveInfoList();
        if(result.isSuccess()){
            return result.getData();
        }
        return null;
    }


}

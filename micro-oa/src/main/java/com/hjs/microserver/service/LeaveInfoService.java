package com.hjs.microserver.service;

import com.hjs.microserver.entity.LeaveInfo;
import com.hjs.microserver.mapper.LeaveInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jianshuang_huang
 * @since 2020-05-02
 */
@Service
public class LeaveInfoService {

    @Autowired
    private LeaveInfoMapper leaveInfoMapper;


    /**
     * 发起请假申请
     * @param leaveInfo
     */
    public void saveSubmit(LeaveInfo leaveInfo){

        

    }


}

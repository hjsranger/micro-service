package com.hjs.microserver.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hjs.microserver.common.utils.UUIDUtils;
import com.hjs.microserver.entity.LeaveInfo;
import com.hjs.microserver.entity.vo.SysUserVO;
import com.hjs.microserver.feign.HrService;
import com.hjs.microserver.mapper.LeaveInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    @Autowired
    private HrService hrService;

    /**
     * 发起请假申请
     * @param leaveInfo
     */
    public void saveSubmit(LeaveInfo leaveInfo){
        //生成ID
        leaveInfo.setLeaveId(UUIDUtils.getId());
        leaveInfo.setCreateDate(new Date());
        //审批中
        leaveInfo.setLeaveStatus(1);
        //查询审批关系
        SysUserVO userVO = hrService.queryById(leaveInfo.getUserAccount());
        if(userVO != null){
            leaveInfo.setApproveUser(userVO.getDeptHead());
        }
        leaveInfoMapper.insert(leaveInfo);
    }

    /**
     * 查询全部的请假申请
     * @return
     */
    public List<LeaveInfo> listAllLeaveInfo(){
        QueryWrapper<LeaveInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("create_date");
        List<LeaveInfo> list =  leaveInfoMapper.selectList(queryWrapper);

        for (LeaveInfo info : list) {
            //查询人员姓名
            SysUserVO user = hrService.queryById(info.getUserAccount());
            if(user != null){
                info.setUserName(user.getUserName());
            }
            //查询人员姓名
            SysUserVO approveUser = hrService.queryById(info.getApproveUser());
            if(approveUser != null){
                info.setApproveUserName(approveUser.getUserName());
            }
        }
        return list;
    }

}

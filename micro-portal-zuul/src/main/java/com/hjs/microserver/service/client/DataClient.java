package com.hjs.microserver.service.client;

import com.hjs.microserver.common.view.JsonResult;
import com.hjs.microserver.entity.LeaveInfoVO;
import com.hjs.microserver.entity.SysUserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("zuul-client")
public interface DataClient {

    /**
     * 获取所有用户
     * @return
     */
    @GetMapping("/hr/api/hr/user/queryList")
    JsonResult<List<SysUserVO>> listUsers();

    /**
     * 根据Id查询用户信息
     * @param account
     * @return
     */
    @GetMapping("/hr/api/hr/user/queryById")
    JsonResult<SysUserVO> queryById(@RequestParam("account") String account);

    /**
     * 查看请假详情
     * @return
     */
    @GetMapping("/oa/api/oa/leave/queryAll")
    JsonResult<List<LeaveInfoVO>> queryLeaveInfoList();

}

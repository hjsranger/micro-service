package com.hjs.microserver.feign.client;

import com.hjs.microserver.common.view.JsonResult;
import com.hjs.microserver.entity.vo.SysUserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("micro-hr")
public interface HrUserClient {

    /**
     * 获取所有用户
     * @return
     */
    @GetMapping("/api/hr/user/queryList")
    JsonResult<List<SysUserVO>> listUsers();

    /**
     * 根据Id查询用户信息
     * @param account
     * @return
     */
    @GetMapping("/api/hr/user/queryById")
    JsonResult<SysUserVO> queryById(@RequestParam("account") String account);
}

package com.hjs.microserver.service.client;

import com.hjs.microserver.common.view.JsonResult;
import com.hjs.microserver.entity.LeaveInfoVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("micro-oa")
public interface OaClient {

    @GetMapping("/api/oa/leave/queryAll")
    JsonResult<List<LeaveInfoVO>> queryLeaveInfoList();

}

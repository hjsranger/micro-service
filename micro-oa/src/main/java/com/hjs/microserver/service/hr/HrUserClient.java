package com.hjs.microserver.service.hr;

import com.hjs.microserver.entity.vo.SysUserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("micro-hr")
public interface HrUserClient {

    @GetMapping("/api/hr/user/queryList")
    String listUsers();

}

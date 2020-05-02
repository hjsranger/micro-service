package com.hjs.microserver.controller;


import com.hjs.microserver.common.BaseController;
import com.hjs.microserver.common.view.JsonResult;
import com.hjs.microserver.entity.LeaveInfo;
import com.hjs.microserver.service.LeaveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jianshuang_huang
 * @since 2020-04-10
 */
@RestController
@RequestMapping("/api/oa/leave")
public class LeaveController extends BaseController {

    @Autowired
    private LeaveInfoService leaveInfoService;

    /**
     * 发起请假申请
     * @param leaveInfo
     * @return
     */
    @PostMapping("/submit")
    public JsonResult submit(@RequestBody LeaveInfo leaveInfo) {
        return null;
    }

}

package com.hjs.microserver.controller;


import com.hjs.microserver.common.BaseController;
import com.hjs.microserver.common.view.JsonResult;
import com.hjs.microserver.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/api/portal")
public class PortalController extends BaseController {

    @Autowired
    private DataService dataService;

    /**
     * 查询所有的人员信息
     * @return
     */
    @GetMapping("/user/queryAll")
    public JsonResult queryAllUser(){
        List list = dataService.listUsers();
        return wrapperJsonResult(list);
    }


    /**
     * 查询所有的请假申请
     * @return
     */
    @GetMapping("/leave/queryAll")
    public JsonResult queryAllLeave(){
        List list = dataService.queryLeaveInfoList();
        return wrapperJsonResult(list);
    }

}

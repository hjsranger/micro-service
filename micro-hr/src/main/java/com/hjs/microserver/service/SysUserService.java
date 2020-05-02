package com.hjs.microserver.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hjs.microserver.common.exception.CustomerExceptionCatch;
import com.hjs.microserver.common.exception.ExceptionCast;
import com.hjs.microserver.common.view.ResultCode;
import com.hjs.microserver.entity.SysUser;
import com.hjs.microserver.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 查询所有的人员
     * @return
     */
    public List<SysUser> queryList(){
        return sysUserMapper.selectList(new QueryWrapper<>());
    }

    /**
     * 根据用户ID查询用户
     * @param account
     * @return
     */
    public SysUser queryUserById(String account){
        SysUser user =  sysUserMapper.selectById(account);
        if(user == null){
            ExceptionCast.cast(ResultCode.NO_USER);
        }
        return user;
    }

}

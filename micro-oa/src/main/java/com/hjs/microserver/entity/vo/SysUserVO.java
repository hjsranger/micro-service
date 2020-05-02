package com.hjs.microserver.entity.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jianshuang_huang
 * @since 2020-05-02
 */
@Data
public class SysUserVO implements Serializable {

    /**
     * 人员account
     */
    private String userAccount;

    /**
     * 人员姓名
     */
    private String userName;

    /**
     * 电话
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 部门负责人account
     */
    private String deptHead;

    /**
     * 部门名称
     */
    private String deptName;


}

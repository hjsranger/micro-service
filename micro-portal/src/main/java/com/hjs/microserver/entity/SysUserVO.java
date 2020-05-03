package com.hjs.microserver.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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

    private String userAccount;

    private String userName;

    private String mobile;

    private String email;

    private String deptHead;

    private String deptName;


}

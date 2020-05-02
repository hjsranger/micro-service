package com.hjs.microserver.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LeaveInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 请假ID
     */
    @TableId
    private String leaveId;

    /**
     * 请假人
     */
    private String userAccount;
    @TableField(exist = false)
    private String userName;

    /**
     * 请假天数
     */
    private Double leaveDays;

    /**
     * 请假理由
     */
    private String leaveReason;

    /**
     * 审批人
     */
    private String approveUser;

    @TableField(exist = false)
    private String approveUserName;

    /**
     * 请假状态，1审批中 2审批完成 3审批拒绝
     */
    private Integer leaveStatus;

    /**
     * 请假时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;


}

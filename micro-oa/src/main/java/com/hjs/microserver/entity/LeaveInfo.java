package com.hjs.microserver.entity;

import java.time.LocalDateTime;
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

    /**
     * 请假状态，1审批中 2审批完成 3审批拒绝
     */
    private Integer leaveStatus;

    /**
     * 请假时间
     */
    private LocalDateTime createDate;


}

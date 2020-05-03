package com.hjs.microserver.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

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
public class LeaveInfoVO implements Serializable {

    private String leaveId;

    private String userAccount;

    private String userName;

    private Double leaveDays;

    private String leaveReason;

    private String approveUser;

    private String approveUserName;

    private Integer leaveStatus;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;


}

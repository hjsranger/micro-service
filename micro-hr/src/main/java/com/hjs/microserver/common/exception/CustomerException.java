package com.hjs.microserver.common.exception;

import com.hjs.microserver.common.view.ResultCode;

/**
 * 自定义异常
 */
public class CustomerException extends RuntimeException {
    private ResultCode resultCode;
    public CustomerException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
    public ResultCode getResultCode() {
        return resultCode;
    }
}

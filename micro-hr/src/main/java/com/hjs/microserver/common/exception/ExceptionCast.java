package com.hjs.microserver.common.exception;

import com.hjs.microserver.common.view.ResultCode;

public class ExceptionCast {
    
    public static void cast(ResultCode resultCode){
        throw new CustomerException(resultCode);
    }
}

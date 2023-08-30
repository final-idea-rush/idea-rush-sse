package com.bid.idearushsse.global.exception;

import org.springframework.http.HttpStatus;

public abstract class ErrorCustomRuntimeException extends RuntimeException {

    public abstract HttpStatus getHttpStatus();
    public abstract String getMsg();

}

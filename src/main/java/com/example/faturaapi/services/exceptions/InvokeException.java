package com.example.faturaapi.services.exceptions;

public class InvokeException extends APIException {

    private static final long serialVersionUID = 1L;

    public InvokeException(String msg) {
        super(msg, 500);
    }

    public InvokeException(String msg, Throwable cause) {
        super(msg, 500, cause);
    }

    public InvokeException(String msg, int status) {
        super(msg, status);
    }

}

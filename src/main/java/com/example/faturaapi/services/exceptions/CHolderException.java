package com.example.faturaapi.services.exceptions;

public class CHolderException extends APIException {

    private static final long serialVersionUID = 1L;

    public CHolderException(String msg) {
        super(msg, 500);
    }

    public CHolderException(String msg, Throwable cause) {
        super(msg, 500, cause);
    }
}

package com.example.faturaapi.services.exceptions;

public class QueryException extends APIException {

    private static final long serialVersionUID = 1L;

    public QueryException(String msg) {
        super(msg, 404);
    }

    public QueryException(String msg, Throwable cause) {
        super(msg, 404, cause);
    }

}

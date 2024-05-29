package com.ramengo.exceptions;

public class UnauthorizedKeyException extends RuntimeException {

    public UnauthorizedKeyException() {
        super("x-api-key header missing");
    }

    public UnauthorizedKeyException(String message) {
        super(message);
    }

}

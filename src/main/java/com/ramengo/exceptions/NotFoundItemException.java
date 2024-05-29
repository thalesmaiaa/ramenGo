package com.ramengo.exceptions;

public class NotFoundItemException extends RuntimeException {

    public NotFoundItemException() {
        super("Missing required items");
    }

    public NotFoundItemException(String message) {
        super(message);
    }
    
}

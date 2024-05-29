package com.ramengo.exceptions;

public class ServerErrorException extends RuntimeException {

    public ServerErrorException() {
        super("could not place order");
    }

    public ServerErrorException(String message) {
        super(message);
    }

}

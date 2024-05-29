package com.ramengo.exceptions;

public class OrderMissingFieldException extends RuntimeException {

    public OrderMissingFieldException() {
        super("both brothId and proteinId are required");
    }

    public OrderMissingFieldException(String message) {
        super(message);
    }

}

package com.ramengo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UnauthorizedKeyException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    private ResponseEntity<ExceptionMessage> UnauthorizedKeyHandler(UnauthorizedKeyException exception) {
        ExceptionMessage messages = new ExceptionMessage(exception.getMessage());
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(messages);
    }

    @ExceptionHandler(OrderMissingFieldException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    private ResponseEntity<ExceptionMessage> OrderMissingFieldExceptionHandler(OrderMissingFieldException exception) {
        ExceptionMessage messages = new ExceptionMessage(exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messages);
    }

    @ExceptionHandler(NotFoundItemException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    private ResponseEntity<ExceptionMessage> NotFoundItemsExceptionHandler(NotFoundItemException exception) {
        ExceptionMessage messages = new ExceptionMessage(exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(messages);
    }

    @ExceptionHandler(ServerErrorException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    private ResponseEntity<ExceptionMessage> ServerErrorExceptionHandler(ServerErrorException exception) {
        ExceptionMessage messages = new ExceptionMessage(exception.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(messages);
    }

    @ExceptionHandler(ResourceAccessException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    private ResponseEntity<ExceptionMessage> ResourceAccessExceptionHandler() {
        ExceptionMessage messages = new ExceptionMessage("could not place order");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(messages);
    }

//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    private ResponseEntity<ExceptionMessage> handleGenericException() {
//        ExceptionMessage messages = new ExceptionMessage("could not place order");
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(messages);
//    }

}

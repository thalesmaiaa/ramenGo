package com.ramengo.controllers;


import static org.springframework.http.ResponseEntity.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Component
public class AbstractController {

    @Autowired
    protected ObjectMapper jsonMapper;

    protected ObjectNode json() {
        return jsonMapper.createObjectNode();
    }

    protected ResponseEntity<?> created(ObjectNode body) {
        return status(HttpStatus.CREATED).body(body);
    }

}

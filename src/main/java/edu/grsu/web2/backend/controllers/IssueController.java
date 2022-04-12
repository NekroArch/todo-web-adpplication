package edu.grsu.web2.backend.controllers;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssueController{


    @GetMapping("/")
    public String getCurrentTime() {

        return Instant.now().toString();
    }

}
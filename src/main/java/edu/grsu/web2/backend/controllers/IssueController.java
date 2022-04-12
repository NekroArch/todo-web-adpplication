package edu.grsu.web2.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IssueController{


    @GetMapping("/issue")
    public ModelAndView getIssues() {

        return new ModelAndView("index");
    }

}
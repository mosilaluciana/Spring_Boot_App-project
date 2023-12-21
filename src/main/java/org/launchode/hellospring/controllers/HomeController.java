package org.launchode.hellospring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    @GetMapping
    public String index(){
        return "index";
    }

}


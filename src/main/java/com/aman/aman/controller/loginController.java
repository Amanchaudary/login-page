package com.aman.aman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aman.aman.dae.alienrepo;
import com.aman.aman.model.alien;

@Controller
public class loginController {

    // yo chai database ko deo package ange connet garna
    @Autowired
    alienrepo repo;

    @RequestMapping("/")
    public String login() {
        return "login.html";
    }

    // html ma vako form ko action sanga same hunu parxa
    @RequestMapping("/addwelcome")
    public String addWelcome(alien a) {

        // addWelocme vitra alien name ko data pass garune ra tesloi save garne by using
        // interface
        repo.save(a);
        System.out.println("chu");
        return "welcome.html";
    }
}

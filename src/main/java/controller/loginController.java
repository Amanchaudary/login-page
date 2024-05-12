package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

    @RequestMapping("/")
    public String login(){
        return"login.html";
    }

   @RequestMapping("/addwelcome")
    public String addWelcome(){
        return "welcome.html";
    }
}

package br.com.cuidaidoso.cuidaidososb.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserControler {

    @GetMapping("/login")
    public String login() {
        return "login/login";
    }

}

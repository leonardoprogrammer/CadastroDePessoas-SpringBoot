package com.cadastroapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TesteControlller {

    @RequestMapping("/teste")
    public String index() {
        return "teste";
    }
}

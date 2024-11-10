package com.primer_proyecto.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"","/","/home"})//{}con la llave pasamos varias rutas q van ser tratadas por el mismo metodo
    public String Home(){
        return "redirect:/api/Users";
    }

}

package com.primer_proyecto.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.primer_proyecto.demo.models.User;

@Controller
public class UserController {

@GetMapping("/Details")//metodo para cualquier peticion atraves de una ruta url q se coloca mediante un enlace get-post    
public String Details(Model model){
    //para esto mismo se puede utlizar map y pasar por <string, object, etc>...model.put(el object)
   User user = new User("Fátima Gisele", "Altamirano");
    model.addAttribute("title", "WELCOME");
    model.addAttribute("user", user );
    
    return "Details";
    
}


}

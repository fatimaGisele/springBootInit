package com.primer_proyecto.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
@GetMapping("/List")
public String List(ModelMap m){
    m.addAttribute("title","Listado de usuarios");
    return "List";
}

@ModelAttribute("users")//esta va a guardar users y lo va a hacer global para todo el controlador, para reutilizar datos
public List<User> Users(){
    List<User> users = new ArrayList<>();
    users.add(new User("Fátima Gisele", "Altamirano","fatu@gmail.com"));
    users.add(new User("Florencia Natalia", "Altamirano"));
    users.add(new User("Elias Nahuel", "Altamirano"));
    return users;
}
}

package com.primer_proyecto.demo.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primer_proyecto.demo.models.User;

@RestController//convierte el metodo hadler en uno handler rest, devuelve el contenido como json
@RequestMapping("/api") //nos permite colocar una ruta base

public class UserRestController {

@GetMapping("/Details")//metodo para cualquier peticion atraves de una ruta url q se coloca mediante un enlace get-post    
public Map<String, Object> Details(){
    //se utliza map y pasar por <string, object, etc>
    Map<String, Object> m = new HashMap<>();
    User user = new User("Fátima Gisele", "Altamirano");
    m.put("title", "WELCOME");
    m.put("user", user);
    return m;
    
}


}

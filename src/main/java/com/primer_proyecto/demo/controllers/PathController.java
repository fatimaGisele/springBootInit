package com.primer_proyecto.demo.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primer_proyecto.demo.models.User;
import com.primer_proyecto.demo.models.dto.ParamDto;

@RestController
@RequestMapping("api/milanesita")
public class PathController {

    @Value("${config.username}")//value es una notacion q nos permite inyectar configuraciones
    private String username;
    @Value("${config.message}")
    private String message;
    @Value("${config.listOfValues}")
    private String[] listOfValues;
    @Value("${config.code}")
    private Integer code;
    @Value("#{ '${config.listOfValues}'.toUpperCase().split(',') }")//para expresiones #, y dentro la variable. para tratarlo como string se anida en ''
    private List<String> holis;
    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valuesMap;
    @Autowired//busca componentes de spring q esten almacenados en el contenedor
    private Environment env;
    
    @GetMapping("/morci/{message}")//lo q esta entre{}es variable
    public ParamDto Morcirucho(@PathVariable String message){//capturamos esa ruta variable atraves de este metodo usando el mismo nombre q en la url variable
        ParamDto p = new ParamDto();
        p.setMessage(message);
        return p;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> MixPathVariable(@PathVariable String product, @PathVariable Integer id){
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);

        return json;
    } 

    @PostMapping("/create")//suele usarse la ruta base, no suele tener una ruta ya q es un post!!!
    public User Create(@RequestBody User user){//importante para esto tener un constructor vacio, sino va a dar error 500
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> Values(){//se puede pasar como atributos al metodo mismo en vez de ser una propiedad de la clase con metodoName(@Value("${config.username}") String username)
        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("message", message);
        json.put("code", code);
        json.put("listOfValues", listOfValues);
        json.put("holis", holis);
        json.put("valuesMap", valuesMap);
        json.put("message2", env.getProperty("config.message"));
        return json;
    }

}

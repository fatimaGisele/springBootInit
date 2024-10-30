package com.primer_proyecto.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primer_proyecto.demo.models.dto.ParamDto;

@RestController
@RequestMapping("api/milanesita")
public class PathController {

    @GetMapping("/morci/{message}")//lo q esta entre{}es variable
    public ParamDto Morcirucho(@PathVariable String message){//capturamos esa ruta variable atraves de este metodo usando el mismo nombre q en la url variable
        ParamDto p = new ParamDto();
        p.setMessage(message);
        return p;
    }
}

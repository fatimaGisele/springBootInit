package com.primer_proyecto.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.primer_proyecto.demo.models.dto.ParamDto;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/params")//ruta base de este controlador
public class RequestParamsController {

    @GetMapping("/holis")
    public ParamDto Holis(@RequestParam(required = false) String msg){
        ParamDto myParam = new ParamDto();
        myParam.setMessage(msg != null ? msg: "vas a estar bien");
        return myParam;
    }

    @GetMapping("/pichus")
    public ParamDto Pichus(@RequestParam Integer Code, @RequestParam String txt){//por parametros solo se envian datos simples no objetos
        ParamDto params = new ParamDto();
        params.setMessage(txt);
        params.setId(Code);
        return params;
    }

    @GetMapping("/mila")
    public ParamDto Request(HttpServletRequest r){//vamos a inyectar el objeto http
        ParamDto param = new ParamDto();
        Integer id = 0;
        try {
            id= Integer.parseInt(r.getParameter("id"));
        } catch (NumberFormatException e) {
            e.getMessage();
        }
        param.setId(id);
        param.setMessage(r.getParameter("message"));
        return param;
    }
}

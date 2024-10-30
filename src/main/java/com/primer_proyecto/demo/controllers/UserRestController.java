package com.primer_proyecto.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.primer_proyecto.demo.models.User;
import com.primer_proyecto.demo.models.dto.UserDTO;

@RestController//convierte el metodo hadler en uno handler rest, devuelve el contenido como json
@RequestMapping("/api") //nos permite colocar una ruta base

public class UserRestController {

@GetMapping("/Details")//metodo para cualquier peticion atraves de una ruta url q se coloca mediante un enlace get-post    
public UserDTO Details(){
    //se utliza map y pasar por <string, object, etc>
    UserDTO userDTO = new UserDTO(null, null);
    User user = new User("Fátima Gisele", "Altamirano");

    userDTO.setUser(user);
    userDTO.setTitle("Hola, quiero que sepas que aun te amo y me duele que no sea mutuo");
   
    return userDTO;
    
}

@GetMapping("/Users")
public List<User> UserList(){
    User user1 = new User("Fátima Gisele", "Altamirano");
    User user2 = new User("Florencia Natalia", "Altamirano");
    User user3 = new User("Elias Nahuel", "Altamirano");
    List<User> Users = Arrays.asList(user1,user2,user3);
    return Users;
}

}

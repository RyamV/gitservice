package com.api.app.services;

import com.api.app.models.ModelResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/servicesREST")
public class UserService {
    @RequestMapping(method = RequestMethod.GET, produces = "application/json", path = "/getUsuario")
    
    public @ResponseBody ModelResponse getUsuario() {
        ModelResponse respuesta = new ModelResponse();
        respuesta.setCodigo(200);
        respuesta.setId(1);
        respuesta.setNombre("Java Revolutions");
        respuesta.setStatus(true);
        
        return respuesta;
    }
}

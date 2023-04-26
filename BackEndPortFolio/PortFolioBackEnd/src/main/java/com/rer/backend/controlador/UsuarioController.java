package com.rer.backend.controlador;

import com.rer.backend.Seguridad.Entidad.Usuario;
import com.rer.backend.servicios.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
     @Autowired
    private IUsuarioService IUserServ;
    
    @PostMapping("/agregardatosUser") 
    public void agregarDatosUser(@RequestBody Usuario user){
        IUserServ.agregarDatosUser(user);
    }  
    @GetMapping("/verdatosUser")
    @ResponseBody
    public List<Usuario> verDatosUser(){
        return IUserServ.verDatosUser();
    }
    @DeleteMapping("/deleteUser/{id}")
     public void borrarDatosUser(@PathVariable long id){
        IUserServ.borrarDatosUser(id);
     }
      @GetMapping("/buscarUser")
    public void buscarDatosUser(@PathVariable long id){
         IUserServ.buscarDatosUser(id);
    }  
    @PutMapping("/updatedatosUser")
    public void updateDatosJL(@RequestBody Usuario user) {
        IUserServ.updateDatosUser(user);
    }
}

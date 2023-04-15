package com.rer.backend.controlador;

import com.rer.backend.modelos.JornadaLaboral;
import com.rer.backend.servicios.IJornadaLaboralService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JornadaLaboralController {
     @Autowired
    private IJornadaLaboralService IJorLServ;
    
    @PostMapping("/agregar/datosJornada") 
    public void agregarDatosJL(@RequestBody JornadaLaboral jor){
        IJorLServ.agregarDatosJL(jor);
    }  
    @GetMapping("/ver/datosJornada")
    @ResponseBody
    public List<JornadaLaboral> verDatosJL(){
        return IJorLServ.verDatosJL();
    }
    @DeleteMapping("/deleteJornada/{id}")
     public void borrarDatosJL(@PathVariable long id){
        IJorLServ.borrarDatosJL(id);
     }    
    @PutMapping("/update/datosJornada")
    public void updateDatosJL(@RequestBody JornadaLaboral jor) {
        IJorLServ.updateDatosJL(jor);
    }
    
}

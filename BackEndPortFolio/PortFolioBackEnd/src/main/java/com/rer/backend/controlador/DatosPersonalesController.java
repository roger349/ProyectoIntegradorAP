package com.rer.backend.controlador;


import com.rer.backend.modelos.DatosPersonales;
import com.rer.backend.servicios.IDatosPersonalesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200/")
public class DatosPersonalesController {
    @Autowired
    private IDatosPersonalesService IDatosPerServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/Persona/agregar/datos") 
    public void agregarDatosPersona(@RequestBody DatosPersonales per){
        IDatosPerServ.agregarDatosPersona(per);
    }
    
    @GetMapping("Persona/verdatos")
    @ResponseBody
    public List<DatosPersonales> verDatosPersona(){
        return IDatosPerServ.verDatosPersona();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/Persona/delete/{id}")
     public void borrarDatosPersona(@PathVariable long id){
        IDatosPerServ.borrarDatosPersona(id);
     }
    @PreAuthorize("hasRole('ADMIN')")    
    @PutMapping("/Persona/update/datos")
    public void updateDatosPersona(@RequestBody DatosPersonales per) {
        IDatosPerServ.updateDatosPersona(per);
    }
}

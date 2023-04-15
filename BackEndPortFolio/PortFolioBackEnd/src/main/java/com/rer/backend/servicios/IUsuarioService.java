package com.rer.backend.servicios;


import com.rer.backend.modelos.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    public List<Usuario> verDatosUser();
     
    public void agregarDatosUser(Usuario user);
  
    public void borrarDatosUser(long id);
    
    public Usuario buscarDatosUser(long id);
    
    public void updateDatosUser(Usuario user); 
}

package com.rer.backend.servicios;

import com.rer.backend.modelos.Usuario;
import com.rer.backend.repositorios.UsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    public UsuarioRepositorio UserRep;
    
     @Override
    public List<Usuario> verDatosUser() {
        return UserRep.findAll();
    }

    @Override
    public void agregarDatosUser(Usuario user) {
        UserRep.save(user);
    }

    @Override
    public void borrarDatosUser(long id) {
        UserRep.deleteById(id);
    }
    @Override
    public Usuario buscarDatosUser(long id) {
        return UserRep.findById(id).orElse(null);
    }

    @Override
    public void updateDatosUser(Usuario user) {
         UserRep.save(user);
    }  
}


    
    
      
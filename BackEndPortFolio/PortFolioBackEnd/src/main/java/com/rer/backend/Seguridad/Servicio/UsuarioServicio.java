
package com.rer.backend.Seguridad.Servicio;

import com.rer.backend.Seguridad.Entidad.Usuario;
import com.rer.backend.Seguridad.Repositorio.IUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioServicio {
    @Autowired
    IUsuarioRepository IUserRepo;
    
     public Optional<Usuario> getfindByNombre_usuario(String nom_user){
       return  IUserRepo.findByNombre_usuario(nom_user);
    }
    public void agregar(Usuario User){
       IUserRepo.save(User);    
    }
    public boolean existsByNombre_usuario(String nom_user){
       return IUserRepo.existsByNombre_usuario(nom_user);
    }   
}

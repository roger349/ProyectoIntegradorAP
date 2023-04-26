package com.rer.backend.Seguridad.Servicio;

import com.rer.backend.Seguridad.Entidad.UserAdm;
import com.rer.backend.Seguridad.Entidad.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class UsuarioDetailsImplements implements UserDetailsService {
       @Autowired
       UsuarioServicio UserServ;

    @Override
    public UserDetails loadUserByUsername(String nombre_usuario) throws UsernameNotFoundException {
       Usuario User = UserServ.getfindByNombre_usuario(nombre_usuario).get();
       return UserAdm.build(User);
    }
}

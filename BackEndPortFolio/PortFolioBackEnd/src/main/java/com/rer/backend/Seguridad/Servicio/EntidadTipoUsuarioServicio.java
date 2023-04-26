package com.rer.backend.Seguridad.Servicio;

import com.rer.backend.Seguridad.Entidad.EntidadTipoUsuario;
import com.rer.backend.Seguridad.Repositorio.IEntidadTipoUsuarioRepository;
import com.rer.backend.Seguridad.TiposDeUsuarios.TipoUsuario;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EntidadTipoUsuarioServicio {
    @Autowired
    IEntidadTipoUsuarioRepository IEntidadUserRepo;
    public Optional<EntidadTipoUsuario> getfindByTipoUsuario(TipoUsuario nombre_tipoUser){
       return  IEntidadUserRepo.findByTipoUsuario(nombre_tipoUser);
    }
    public void agregar(EntidadTipoUsuario ETUser){
       IEntidadUserRepo.save(ETUser);    
    } 
}

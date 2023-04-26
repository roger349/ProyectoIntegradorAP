package com.rer.backend.Seguridad.Repositorio;

import com.rer.backend.Seguridad.Entidad.EntidadTipoUsuario;
import com.rer.backend.Seguridad.TiposDeUsuarios.TipoUsuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntidadTipoUsuarioRepository extends JpaRepository<EntidadTipoUsuario, Integer> {
       Optional<EntidadTipoUsuario> findByTipoUsuario(TipoUsuario nombre_tipoUser); 
}

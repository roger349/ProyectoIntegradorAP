package com.rer.backend.Seguridad.Repositorio;

import com.rer.backend.Seguridad.Entidad.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
     Optional<Usuario> findByNombre_usuario(String nombre_usuario);
     boolean existsByNombre_usuario(String nombre_usuario);
}

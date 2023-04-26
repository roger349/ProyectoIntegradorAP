package com.rer.backend.Seguridad.Controlador;

import com.rer.backend.Seguridad.JWTModelos.JWTModelo;
import com.rer.backend.Seguridad.JWTModelos.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rer.backend.Seguridad.JsonWebToken.JWTProveedor;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class ControladorDeAutentificacion {
    @Autowired
    AuthenticationManager authenticationManager;
    
    @PostMapping("/userLogin")
    public ResponseEntity<JWTModelo> login(@Valid @RequestBody UserLogin userLogin, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensajes("Datos Mal Ingresados"), HttpStatus.BAD_REQUEST);
        
        Authentication authe = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
        userLogin.getNombre_usuario(), userLogin.getPassword_usuario()));
        
        SecurityContextHolder.getContext().setAuthentication(authe);
        
        String JWTtoken = JWTProveedor.generateToken(authe);
        
        UserDetails UserDe = (UserDetails) authe.getPrincipal();
        
        JWTModelo JWTMod = new JWTModelo(JWTtoken, UserDe.getUsername(), UserDe.getAuthorities());
        
        return new ResponseEntity(JWTMod, HttpStatus.OK);
    }
}

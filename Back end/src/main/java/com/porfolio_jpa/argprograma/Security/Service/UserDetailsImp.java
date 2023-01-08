
package com.porfolio_jpa.argprograma.Security.Service;

import com.porfolio_jpa.argprograma.Security.Entity.Usuario;
import com.porfolio_jpa.argprograma.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImp implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreusuario) throws UsernameNotFoundException {
       Usuario usuario = usuarioService.getByNombreusuario(nombreusuario).get();
       return UsuarioPrincipal.build(usuario);
    }
    
    
}


package com.porfolio_jpa.argprograma.Security.Service;

import com.porfolio_jpa.argprograma.Security.Entity.Usuario;
import com.porfolio_jpa.argprograma.Security.Repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
        public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
    
        public void save(Usuario usuario){
            iusuarioRepository.save(usuario);
        }
}

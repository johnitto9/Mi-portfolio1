
package com.porfolio_jpa.argprograma.Security.Repository;

import com.porfolio_jpa.argprograma.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByNombreusuario(String nombreusuario);
    
    boolean existsByNombreusuario(String nombreusuario);
    boolean existsByEmail(String email);
    
    
}

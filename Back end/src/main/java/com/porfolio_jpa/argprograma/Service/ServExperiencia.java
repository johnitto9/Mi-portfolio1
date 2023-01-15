
package com.porfolio_jpa.argprograma.Service;

import com.porfolio_jpa.argprograma.Entity.Experiencia;
import com.porfolio_jpa.argprograma.Repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServExperiencia {
    
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }
    
    public Optional<Experiencia> getOne(Long id){
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreEmpresa(String nombreEmpresa){
        return rExperiencia.findByNombreEmpresa(nombreEmpresa);
    }
    
    public void save(Experiencia expe){
        rExperiencia.save(expe);
    }
    
    public void delete(Long id){
        rExperiencia.deleteById(id);
    }
    
    public boolean existsById(Long id){
        return rExperiencia.existsById(id);
    }
    
   
public boolean existsByNombreEmpresa(String nombreEmpresa){
return rExperiencia.existsByNombreEmpresa(nombreEmpresa);
    }
}
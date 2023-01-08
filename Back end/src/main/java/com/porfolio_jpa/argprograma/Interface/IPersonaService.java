
package com.porfolio_jpa.argPrograma.Interface;

import com.porfolio_jpa.argPrograma.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Traer lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Elimiinar un objeto buscado por id
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
}


package com.JPA.portfolioArgPrograma.Repository;

import com.JPA.portfolioArgPrograma.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
    
}

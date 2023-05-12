
package com.portfolio.Portfolio.Repositorio;

import com.portfolio.Portfolio.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona, Long>{
    
}

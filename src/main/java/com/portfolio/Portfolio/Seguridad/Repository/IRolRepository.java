
package com.portfolio.Portfolio.Seguridad.Repository;

import com.portfolio.Portfolio.Seguridad.Entity.Rol;
import com.portfolio.Portfolio.Seguridad.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

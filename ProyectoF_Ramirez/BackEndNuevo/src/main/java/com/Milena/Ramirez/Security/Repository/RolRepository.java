
package com.Milena.Ramirez.Security.Repository;

import com.Milena.Ramirez.Security.Entity.Rol;
import com.Milena.Ramirez.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
Optional<Rol> findByRolNombre (RolNombre rolNombre);
    
}

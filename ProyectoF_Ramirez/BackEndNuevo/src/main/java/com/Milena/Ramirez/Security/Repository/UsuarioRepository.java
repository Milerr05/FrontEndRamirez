
package com.Milena.Ramirez.Security.Repository;

import com.Milena.Ramirez.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
Optional<Usuario> findByNombreUsuario(String nombreUsuario);

boolean existByNombreUsuario(String nombreUsuario);
boolean existByEmail (String email);
    
}

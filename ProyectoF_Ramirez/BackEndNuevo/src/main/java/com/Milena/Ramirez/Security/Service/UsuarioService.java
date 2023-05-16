package com.Milena.Ramirez.Security.Service;

import com.Milena.Ramirez.Security.Entity.Usuario;
import com.Milena.Ramirez.Security.Repository.UsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
UsuarioRepository usuarioRepository;

public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
return usuarioRepository.findByNombreUsuario(nombreUsuario);
}

public boolean existsByNombreUusuario(String nombreUsuario){
return usuarioRepository.existByNombreUsuario(nombreUsuario);
}
public boolean existsByEmail(String email){
return usuarioRepository.existByEmail(email);
}

public void save(Usuario usuario){
usuarioRepository.save(usuario);
}
}


package com.Milena.Ramirez.Service;

import com.Milena.Ramirez.Entity.Persona;
import com.Milena.Ramirez.Interface.IPersonaService;
import com.Milena.Ramirez.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
     @Autowired IPersonaRepository ipersonaRepository;

@Override
    public List<Persona> getPersona(){
List<Persona> persona;
         persona = ipersonaRepository.findAll();
return persona;
}

@Override
    public void savePersona(Persona persona){
ipersonaRepository.save(persona);
}

@Override
    public void deletePersona(Long id){
ipersonaRepository.deleteById(id);
}

@Override
    public Persona findPersona(Long id){
Persona persona;
      persona = ipersonaRepository.findById(id).orElse(null);
return persona;


}
}


package com.Milena.Ramirez.Controler;

import com.Milena.Ramirez.Entity.Persona;
import com.Milena.Ramirez.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaControler {
@Autowired IPersonaService ipersonaService;
   
@GetMapping ("/personas/traer")
public List <Persona> getPersona(){
return ipersonaService.getPersona();
}

@PostMapping ("/personas/crear")
public String createPersona(@RequestBody Persona persona){
ipersonaService.savePersona(persona);
return "La persona fue creada correctamente";
}

@DeleteMapping("/personas/borrar/(id)")
public String deletePersona (@PathVariable Long id){
return "La persona fue eliminada correctamente";
}

//URL:PUERTO/personas/editar/id/nombre&apellido&img
@PutMapping ("/personas/editar(id)")
public Persona editPersona (@PathVariable Long id,
                            @RequestParam("nombre") String nuevoNombre,
                            @RequestParam("apellido") String nuevoApellido,
                            @RequestParam("img") String nuevaImg){
        Persona persona = ipersonaService.findPersona(id);

persona.setNombre(nuevoNombre);
persona.setApellido(nuevoApellido);
persona.setImg(nuevaImg);

ipersonaService.savePersona(persona);
return persona;
}
}

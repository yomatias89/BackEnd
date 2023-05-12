
package com.portfolio.Portfolio.Controles;

import com.portfolio.Portfolio.Entidad.Persona;
import com.portfolio.Portfolio.Interfaz.IPersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@CrossOrigin(origins = "https://portfolio-angular-df7c7.web.app")
public class PersonaControlador {
    @Autowired IPersonaServicio ipersonaServicio;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return ipersonaServicio.getPersona();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String crearPersona(@RequestBody Persona persona){
        ipersonaServicio.GuardarPersona(persona);
        return "La persona fue creada correctamente";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String borrarPersona(@PathVariable Long id){
        ipersonaServicio.borrarPersona(id);
        return "La persona fue eliminada";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/personas/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
                                 @RequestParam("nombre")String nuevoNombre,
                                 @RequestParam("apellido")String nuevoApellido,
                                 @RequestParam("img")String nuevaimg){
        Persona persona = ipersonaServicio.encontrarPerosona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevaimg);
        
        ipersonaServicio.GuardarPersona(persona);
        return persona;
    }
                                 
}

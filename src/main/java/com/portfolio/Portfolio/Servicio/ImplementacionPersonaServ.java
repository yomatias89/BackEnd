
package com.portfolio.Portfolio.Servicio;

import com.portfolio.Portfolio.Entidad.Persona;
import com.portfolio.Portfolio.Interfaz.IPersonaServicio;
import com.portfolio.Portfolio.Repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionPersonaServ implements IPersonaServicio{

    @Autowired IPersonaRepositorio ipersonaRepositorio;
    
    @Override
    public List<Persona> getPersona() {
        List <Persona>persona = ipersonaRepositorio.findAll();
        return persona;
    }

    @Override
    public void GuardarPersona(Persona persona) {
        ipersonaRepositorio.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        ipersonaRepositorio.deleteById(id);
    }

    @Override
    public Persona encontrarPerosona(Long id) {
        Persona persona = ipersonaRepositorio.findById(id).orElse(null);
        return persona;
    }
    
}

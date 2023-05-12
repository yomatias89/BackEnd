
package com.portfolio.Portfolio.Interfaz;

import com.portfolio.Portfolio.Entidad.Persona;
import java.util.List;


public interface IPersonaServicio {
    
    //Traer persona
    public List<Persona> getPersona();
    //Guardar persona
    public void GuardarPersona(Persona persona);
    //Eliminar persona
    public void borrarPersona(Long id);
    //Buscar persona
    public Persona encontrarPerosona(Long id);
}

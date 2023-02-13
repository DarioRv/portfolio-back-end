package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.Persona;
import com.portfolio.PortfolioAPI.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository perRepository;
    
    @Override
    public void crearPersona(Persona persona) {
        perRepository.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        perRepository.deleteById(id);
    }
    
    @Override
    public Persona obtenerPersona (Long id) {
        return perRepository.findById(id).orElse(null);
    }
}

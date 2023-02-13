package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.Persona;

public interface IPersonaService {
    public void crearPersona (Persona persona);
    public void borrarPersona (Long id);
    public Persona obtenerPersona (Long id);
}

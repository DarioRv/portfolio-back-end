package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.Habilidad;
import java.util.List;

public interface IHabilidad {
    public void agregarHabilidad (Habilidad habilidad);
    public void eliminarHabilidad (Long id);
    public List<Habilidad> obtenerHabilidades ();
}

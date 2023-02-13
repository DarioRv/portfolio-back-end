package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.ExperienciaLaboral;
import java.util.List;

public interface IExperienciaLaboral {
    public void agregarExperienciaLaboral (ExperienciaLaboral experiencia);
    public void eliminarExperienciaLaboral (Long id);
    public List<ExperienciaLaboral> verExperienciaLaboral ();
}

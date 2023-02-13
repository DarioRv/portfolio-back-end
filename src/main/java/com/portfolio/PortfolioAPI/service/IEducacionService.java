package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.Educacion;
import java.util.List;

public interface IEducacionService {
    public void agregarEducacion (Educacion educacion);
    public void eliminarEducacion (Long id);
    public List<Educacion> obtenerEducacion ();
}

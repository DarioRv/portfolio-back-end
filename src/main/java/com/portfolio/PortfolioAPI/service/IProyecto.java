package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.Proyecto;
import java.util.List;

public interface IProyecto {
    public void agregarProyecto (Proyecto proyecto);
    public void eliminarProyecto (Long id);
    public List<Proyecto> obtenerProyectos ();
}

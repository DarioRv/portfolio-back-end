package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.Proyecto;
import com.portfolio.PortfolioAPI.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyecto {

    @Autowired
    public ProyectoRepository proRepository;
    
    @Override
    public void agregarProyecto(Proyecto proyecto) {
        proRepository.save(proyecto);
    }

    @Override
    public void eliminarProyecto(Long id) {
        proRepository.deleteById(id);
    }
    
    @Override
    public List<Proyecto> obtenerProyectos () {
        return proRepository.findAll();
    }
    
}

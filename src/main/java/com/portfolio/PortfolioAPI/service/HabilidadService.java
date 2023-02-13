package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.Habilidad;
import com.portfolio.PortfolioAPI.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidad {

    @Autowired
    public HabilidadRepository habRepo;
    
    @Override
    public void agregarHabilidad(Habilidad habilidad) {
        habRepo.save(habilidad);
    }

    @Override
    public void eliminarHabilidad(Long id) {
        habRepo.deleteById(id);
    }
    
    @Override
    public List<Habilidad> obtenerHabilidades () {
        return habRepo.findAll();
    }
    
}

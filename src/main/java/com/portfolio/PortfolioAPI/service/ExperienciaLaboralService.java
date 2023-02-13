package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.ExperienciaLaboral;
import com.portfolio.PortfolioAPI.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboral {

    @Autowired
    public ExperienciaLaboralRepository expRepo;
    
    @Override
    public void agregarExperienciaLaboral(ExperienciaLaboral experiencia) {
        expRepo.save(experiencia);
    }

    @Override
    public void eliminarExperienciaLaboral(Long id) {
        expRepo.deleteById(id);
    }
    
    @Override
    public List<ExperienciaLaboral> verExperienciaLaboral () {
        return expRepo.findAll();
    }
    
}

package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.Educacion;
import com.portfolio.PortfolioAPI.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired 
    public EducacionRepository eduRepo;
    
    @Override
    public void agregarEducacion(Educacion educacion) {
        eduRepo.save(educacion);
    }

    @Override
    public void eliminarEducacion(Long id) {
        eduRepo.deleteById(id);
    }
    
    @Override
    public List<Educacion> obtenerEducacion () {
        return eduRepo.findAll();
    }
}

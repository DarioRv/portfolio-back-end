package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.Contacto;
import com.portfolio.PortfolioAPI.repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService implements IContactoService {

    @Autowired
    public ContactoRepository contacRepo;
    
    @Override
    public void agregarContacto(Contacto contacto) {
        contacRepo.save(contacto);
    }

    @Override
    public void eliminarContacto(Long id) {
        contacRepo.deleteById(id);
    }
    
    @Override
    public List<Contacto> obtenerContacto () {
        return contacRepo.findAll();
    }
}

package com.portfolio.PortfolioAPI.service;

import com.portfolio.PortfolioAPI.model.Contacto;
import java.util.List;

public interface IContactoService {
    public void agregarContacto (Contacto contacto);
    public void eliminarContacto (Long id);
    public List<Contacto> obtenerContacto ();
}

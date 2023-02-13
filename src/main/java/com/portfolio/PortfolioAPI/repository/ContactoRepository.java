package com.portfolio.PortfolioAPI.repository;

import com.portfolio.PortfolioAPI.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository <Contacto, Long>{
    
}

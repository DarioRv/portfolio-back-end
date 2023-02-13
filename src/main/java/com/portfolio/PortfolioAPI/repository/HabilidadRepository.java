package com.portfolio.PortfolioAPI.repository;

import com.portfolio.PortfolioAPI.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository <Habilidad, Long>{
    
}

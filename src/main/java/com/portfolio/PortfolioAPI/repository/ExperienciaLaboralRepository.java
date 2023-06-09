package com.portfolio.PortfolioAPI.repository;

import com.portfolio.PortfolioAPI.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository <ExperienciaLaboral, Long>{
    
}

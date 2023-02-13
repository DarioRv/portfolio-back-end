package com.portfolio.PortfolioAPI.repository;

import com.portfolio.PortfolioAPI.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    
}

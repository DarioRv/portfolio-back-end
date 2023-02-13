package com.portfolio.PortfolioAPI.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Portfolio {
    private Persona personalData;
    private List<Contacto> contact;
    private List<ExperienciaLaboral> laboralExperience;
    private List<Educacion> education;
    private List<Habilidad> skills;
    private List<Proyecto> projects;

    public Portfolio() {
    }

    
    
}

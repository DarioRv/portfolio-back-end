package com.portfolio.PortfolioAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String companyImage;
    private String companyName;
    private String position;
    private String year;
    private String description;
    private Long idPersona;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long id, String companyImage, String companyName, String position, String year, String description, Long idPersona) {
        this.id = id;
        this.companyImage = companyImage;
        this.companyName = companyName;
        this.position = position;
        this.year = year;
        this.description = description;
        this.idPersona = idPersona;
    }
    
}

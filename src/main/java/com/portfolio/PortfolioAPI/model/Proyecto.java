package com.portfolio.PortfolioAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String projectName;
    private String date;
    private String description;
    private String webSiteUrl;
    private String codeUrl;
    private String implementedTechnologies;
    private Long idPersona;

    public Proyecto() {
    }

    public Proyecto(Long id, String projectName, String date, String description, String webSiteUrl, String codeUrl, String implementedTechnologies, Long idPersona) {
        this.id = id;
        this.projectName = projectName;
        this.date = date;
        this.description = description;
        this.webSiteUrl = webSiteUrl;
        this.codeUrl = codeUrl;
        this.implementedTechnologies = implementedTechnologies;
        this.idPersona = idPersona;
    }
    
}

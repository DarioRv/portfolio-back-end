package com.portfolio.PortfolioAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String institutionName;
    private String institutionImage;
    private String shortName;
    private String certificate;
    private String date;
    private String observations;
    private Long idPersona;

    public Educacion() {
    }

    public Educacion(Long id, String institutionName, String institutionImage, String shortName, String certificate, String date, String observations, Long idPersona) {
        this.id = id;
        this.institutionName = institutionName;
        this.institutionImage = institutionImage;
        this.shortName = shortName;
        this.certificate = certificate;
        this.date = date;
        this.observations = observations;
        this.idPersona = idPersona;
    }
    
}

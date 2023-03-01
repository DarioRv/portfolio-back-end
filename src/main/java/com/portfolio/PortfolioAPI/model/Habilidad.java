package com.portfolio.PortfolioAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String image;
    private String type;
    private Long idPersona;

    public Habilidad() {
    }

    public Habilidad(Long id, String name, String image, String type, Long idPersona) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.type = type;
        this.idPersona = idPersona;
    }

}

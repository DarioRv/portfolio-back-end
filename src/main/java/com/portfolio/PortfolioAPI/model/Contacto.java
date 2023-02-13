package com.portfolio.PortfolioAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private String alias;
    private String address;
    private String url;
    private Long idPersona;

    public Contacto() {
    }

    public Contacto(Long id, String alias, String address, String url, Long idPersona) {
        this.id = id;
        this.alias = alias;
        this.address = address;
        this.url = url;
        this.idPersona = idPersona;
    }

    
    
}

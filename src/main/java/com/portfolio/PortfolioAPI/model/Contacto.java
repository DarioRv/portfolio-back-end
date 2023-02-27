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
    private String url;
    private String icon;
    private boolean visible;
    private Long idPersona;

    public Contacto() {
    }

    public Contacto(Long id, String type, String alias, String url, String icon, boolean visible, Long idPersona) {
        this.id = id;
        this.type = type;
        this.alias = alias;
        this.url = url;
        this.icon = icon;
        this.visible = visible;
        this.idPersona = idPersona;
    }
    
}

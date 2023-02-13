package com.portfolio.PortfolioAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String position;
    private String description;
    private String age;
    private String nacionality;
    private String address;
    private String about;

    public Persona() {
    }

    public Persona(Long id, String name, String position, String description, String about) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.description = description;
        this.about = about;
    }
    
}

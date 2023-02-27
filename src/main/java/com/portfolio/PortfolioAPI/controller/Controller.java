package com.portfolio.PortfolioAPI.controller;

import com.portfolio.PortfolioAPI.model.Contacto;
import com.portfolio.PortfolioAPI.model.Educacion;
import com.portfolio.PortfolioAPI.model.ExperienciaLaboral;
import com.portfolio.PortfolioAPI.model.Habilidad;
import com.portfolio.PortfolioAPI.model.Persona;
import com.portfolio.PortfolioAPI.model.Portfolio;
import com.portfolio.PortfolioAPI.model.Proyecto;
import com.portfolio.PortfolioAPI.service.IContactoService;
import com.portfolio.PortfolioAPI.service.IEducacionService;
import com.portfolio.PortfolioAPI.service.IExperienciaLaboral;
import com.portfolio.PortfolioAPI.service.IHabilidad;
import com.portfolio.PortfolioAPI.service.IPersonaService;
import com.portfolio.PortfolioAPI.service.IProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    public IPersonaService persService;
    @Autowired
    public IExperienciaLaboral expService;
    @Autowired
    public IEducacionService eduService;
    @Autowired
    public IHabilidad habService;
    @Autowired
    public IProyecto proyService;
    @Autowired
    public IContactoService contService;
    
    // Persona
    @PostMapping ("/new/personal-data")
    public void crearPersona (@RequestBody Persona persona) {
        persService.crearPersona(persona);
    }
    @DeleteMapping ("/delete/personal-data")
    public void eliminarPersona (@RequestParam Long id) {
        persService.borrarPersona(id);
    }
    @GetMapping ("/view/personal-data")
    public Persona obtenerPersona (@RequestParam Long id) {
        return persService.obtenerPersona(id);
    }
    @PutMapping ("/update/personal-data")
    public void editarPersona (@RequestBody Persona persona) {
        persService.crearPersona(persona);
    }
    
    // Experiencia laboral
    @PostMapping ("/new/laboral-experience")
    public void crearExperienciaLaboral (@RequestBody ExperienciaLaboral experiencia) {
        expService.agregarExperienciaLaboral(experiencia);
    }
    @DeleteMapping ("/delete/laboral-experience")
    public void eliminarExperienciaLaboral (@RequestParam Long id) {
        expService.eliminarExperienciaLaboral(id);
    }
    @GetMapping ("/view/laboral-experience")
    public List<ExperienciaLaboral> verExperienciaLaboral () {
        return expService.verExperienciaLaboral();
    }
    @PutMapping ("/update/laboral-experience")
    public void editarExperienciaLaboral (@RequestBody ExperienciaLaboral experiencia) {
        expService.agregarExperienciaLaboral(experiencia);
    }
    
    // Educación
    @PostMapping ("/new/education")
    public void agregarEducacion (@RequestBody Educacion educacion) {
        eduService.agregarEducacion(educacion);
    }
    @DeleteMapping ("/delete/education")
    public void eliminarEducacion (@RequestParam Long id) {
        eduService.eliminarEducacion(id);
    }
    @GetMapping ("/view/education")
    public List<Educacion> obtenerEducacion (){
        return eduService.obtenerEducacion();
    }
    @PutMapping ("/update/education")
    public void editarEducacion (@RequestBody Educacion educacion) {
        eduService.agregarEducacion(educacion);
    }
    
    // Habilidad
    @PostMapping ("/new/skill") 
    public void agregarHabilidad (@RequestBody Habilidad habilidad) {
        habService.agregarHabilidad(habilidad);
    }
    @DeleteMapping ("/delete/skill")
    public void eliminarHabilidad (@RequestParam Long id) {
        habService.eliminarHabilidad(id);
    }
    @GetMapping ("/view/skills")
    public List<Habilidad> obtenerHabilidades () {
        return habService.obtenerHabilidades();
    }
    @PutMapping ("/update/skill")
    public void editarHabilidad (@RequestBody Habilidad habilidad) {
        habService.agregarHabilidad(habilidad);
    }
    
    // Proyecto
    @PostMapping ("/new/project")
    public void agregarProyecto (@RequestBody Proyecto proyecto) {
        proyService.agregarProyecto(proyecto);
    }
    @DeleteMapping ("/delete/project")
    public void eliminarProyecto (@RequestParam Long id) {
        proyService.eliminarProyecto(id);
    }
    @GetMapping ("/view/projects")
    public List<Proyecto> obtenerProyectos () {
        return proyService.obtenerProyectos();
    }
    @PutMapping ("/update/project")
    public void editarProyecto (@RequestBody Proyecto proyecto) {
        proyService.agregarProyecto(proyecto);
    }
    
    // Contacto
    @PostMapping ("/new/contact")
    public void agregarContacto (@RequestBody Contacto contacto) {
        contService.agregarContacto(contacto);
    }
    @DeleteMapping ("/delete/contact")
    public void eliminarContacto (@RequestParam Long id) {
        contService.eliminarContacto(id);
    }
    @GetMapping ("/view/contacts")
    public List<Contacto> obtenerContacto () {
        return contService.obtenerContacto();
    }
    @PutMapping ("/update/contact")
    public void editarContacto (@RequestBody Contacto contacto) {
        contService.agregarContacto(contacto);
    }
    
    // Armar portfolio
    @GetMapping ("/get/portfolio")
    public Portfolio obtenerPortfolio (@RequestParam Long id) {
        Portfolio portfolio = new Portfolio();
        portfolio.setPersonalData(persService.obtenerPersona(id));
        portfolio.setContact(contService.obtenerContacto());
        portfolio.setLaboralExperience(expService.verExperienciaLaboral());
        portfolio.setEducation(eduService.obtenerEducacion());
        portfolio.setProjects(proyService.obtenerProyectos());
        portfolio.setSkills(habService.obtenerHabilidades());
        return portfolio;
    }
    
}

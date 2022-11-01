/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.hedman.Service;

import com.portfolio.hedman.Entity.Experiencia;
import com.portfolio.hedman.Repository.ExperienciaRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author iara-
 */
@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }
      public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    } 
    public List<Experiencia> buscarExperiencia(){
        return experienciaRepo.findAll();
}
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
    
}


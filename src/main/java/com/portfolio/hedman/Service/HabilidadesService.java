/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.hedman.Service;

import com.portfolio.hedman.Entity.Habilidades;
import com.portfolio.hedman.Repository.HabilidadesRepo;
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
public class HabilidadesService {
    private final HabilidadesRepo habilidadesRepo;

    @Autowired
    public HabilidadesService(HabilidadesRepo habilidadesRepo) {
        this.habilidadesRepo = habilidadesRepo;
    }
      public Habilidades addHabilidad(Habilidades habilidad){
        return habilidadesRepo.save(habilidad);
    } 
    public List<Habilidades> buscarHabilidad(Long id){
        return habilidadesRepo.findAll();
}
    public Habilidades editarHabilidad(Habilidades habilidad){
        return habilidadesRepo.save(habilidad);
    }
    public void borrarHabilidad(Long id){
        habilidadesRepo.deleteById(id);
    }
    
    
}

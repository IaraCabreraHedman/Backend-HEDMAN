/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.hedman.Service;

import com.portfolio.hedman.Entity.Educacion;
import com.portfolio.hedman.Repository.EducacionRepo;
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
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }
    
    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    } 
    public List<Educacion> buscarEdu(){
        return educacionRepo.findAll();
 }
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }

  
}
 
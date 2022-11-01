/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.hedman.Repository;

import com.portfolio.hedman.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author iara-
 */
public interface UsuarioRepo extends JpaRepository <Usuario,Long> {
    
}
